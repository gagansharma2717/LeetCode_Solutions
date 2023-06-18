class Solution{
    static String printMinNumberForPattern(String str){
        
        Stack<Integer> stk = new Stack<>();
        int num = 1;
        String res = "";
        
        // loop on string containing 'I' or 'D'
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == 'D'){ // If 'D' push to stack and increment num
                stk.push(num);
                num++;
            }else{ // IF 'I' push to stack and increment num and pop all elements from stack and add it to result
                stk.push(num);
                num++;
                
                while(stk.size() > 0){
                    res += Integer.toString(stk.pop());
                }
            }
        }
        
        // for last element 
        stk.push(num);
        while(stk.size() > 0){
            res += Integer.toString(stk.pop());;
        }
        
        return res;
    }
}
