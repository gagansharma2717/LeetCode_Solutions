// 901. Online Stock Span
class StockSpanner {
    static class Pair{
        int price;
        int index;
    }

    Stack<Pair> stk;
    int i = 0;

    public StockSpanner() {
        stk = new Stack<>();
        Pair base = new Pair();
        base.price = 1000000; // just like infinite according to constraint price <= 10^5
        base.index = -1;
        stk.push(base);
    }
    
    public int next(int price) {
        Pair p = new Pair();
        p.price = price;
        p.index = i;
        i++;

        while(stk.peek().price <= p.price){
            stk.pop();
        }

        int ans = p.index - stk.peek().index;
        stk.push(p);

        return ans;
    }
}

