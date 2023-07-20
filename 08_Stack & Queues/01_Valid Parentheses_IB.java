// 20.Valid Parentheses - Leetcode or Balanced Parentheses
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); 

        for (char c : s.toCharArray()) { 
            if (c == '(') // if the character is an opening parenthesis
                stack.push(')'); // push the corresponding closing parenthesis onto the stack
            else if (c == '{') 
                stack.push('}'); 
            else if (c == '[') 
                stack.push(']'); 
            else if (stack.isEmpty() || stack.pop() != c) 
            //if the character is a closing bracket or if the stack is empty (i.e., there is no matching opening bracket) or the top of the stack does not match the closing bracket, the string is not valid, so return false
                return false;
        }
        
        // if the stack is empty, all opening brackets have been matched with their corresponding closing brackets,  so the string is valid, otherwise, there are unmatched opening brackets, so return false
        return stack.isEmpty();
    }
}
