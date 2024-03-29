// 12.
// 266. - LeetCode Easy https://leetcode.com/problems/palindrome-permutation/
// Locked

class Solution{
    public boolean canPermutePalindrome(String str){
        HashMap<Character,Integer> fmap = new HashMap<>();
        // Filling Frequency HashMap
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
        }

        // All characters should have even frequency or atmost 1 character with odd frequency in frequency hashmap for palindrome permutation
        int oddCount = 0;
        for(Character c : fmap.keySet()){
            if(fmap.get(c) % 2 == 1){
                oddCount++;
            }
        }

        // If more than one characters have odd frequency then return false 
        if(oddCount > 1) return false;

        return true;

        }
    }