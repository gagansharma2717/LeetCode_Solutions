// First Non-Matching Character
// c1 < c2 , true
// In words of same characters length of second character should be larger

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] mapping = new int[26];
        int value = 0;
//         Filling mapping Array
        for(char ch : order.toCharArray())
        {
            mapping[ch - 'a'] = value++;
        }
        
//         Taking First Two strings to compare and so on and also comparing its lengths
        for(int i = 0 ; i < words.length-1; i++)
        {
            String curr = words[i];
            String next = words[i+1];
            
            int len = Math.min(curr.length(),next.length());
            
            if(len != curr.length() && len == next.length() && curr.startsWith(next))
            {
                return false;
            }
        
//         Comparing Characters of those two strings
            for(int j = 0 ; j < len ; j++)
            {
                char ch1 = curr.charAt(j);
                char ch2 = next.charAt(j);
                
                if(mapping[ch1 -'a'] > mapping[ch2 - 'a'])
                {
                    return false;
                }
                
                if(mapping[ch1 -'a'] < mapping[ch2 - 'a'])
                {
                    break;
                }
                
            }
        }
        
        return true;
    }
}