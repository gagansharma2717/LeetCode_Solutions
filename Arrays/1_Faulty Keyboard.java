// 925. Long Pressed Name 
// https://leetcode.com/problems/long-pressed-name/
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        // Edge case - when typed string is shorter itself
        if(name.length() > typed.length()) return false;
        
        int i = 0 ;
        int j = 0 ;
        
        while(i < name.length() && j < typed.length())
        {
            if(name.charAt(i) == typed.charAt(j))
            {
                i++;
                j++;
            } // checking with previous character 
            else if(i > 0 && name.charAt(i - 1) == typed.charAt(j))
            {
                j++;
            }
            else
            {
                return false;
            }
        }
        
        // typed characters are still left 
        while(j < typed.length())
        {
            if(name.charAt(i - 1) == typed.charAt(j))
            {
                j++;
            }
            else
            {
                return false;
            }
        }
        
        // when i is not reached to last character in name then false else true
        return i < name.length() ? false : true;
    }
}
