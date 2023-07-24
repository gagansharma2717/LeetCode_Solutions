// 32.Longest Valid Parentheses
// 2 stacks
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> chstk = new Stack<>();
        Stack<Integer> idxstk = new Stack<>();
        idxstk.push(-1);
        int max = 0;

        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '('){
                chstk.push('(');
                idxstk.push(i);
            }else{
                // closing brackets
                if(!chstk.isEmpty() && chstk.peek() == '('){
                    chstk.pop();
                    idxstk.pop();

                    max = Math.max(max, i - idxstk.peek());
                }else{
                    idxstk.push(i);
                }
            }
        }

        return max;
    }
}

// One stack
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int max = 0;

        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                stk.push(i);
            }else{
                // closing brackets
                stk.pop();
                if(stk.isEmpty()){
                    stk.push(i);
                    
                }else{
                    max = Math.max(max, i - stk.peek());
                }
            }
        }

        return max;
    }
}