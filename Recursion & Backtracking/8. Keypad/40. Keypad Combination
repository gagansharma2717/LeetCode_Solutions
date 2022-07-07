// 40.
// 17 LeetCode Medium https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class Solution {
    List<String> res;
    String[] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void letterCombinations(int idx, String input, String output) {
        if(idx == input.length()){
            if(output.length() > 0 ){
                res.add(output);
            }
            return;
        }
        
        // taking digit from input string
        char digit = input.charAt(idx);
        // Used that digit to get all the letters from keypad aaray and converted it into character array
        // then ran a loop on that
        for(char letter : keypad[digit - '0'].toCharArray()){
            letterCombinations(idx+1, input, output + letter);
        }
    }
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        // Overloaded method
        letterCombinations(0, digits, "");
        return res;
    }
}