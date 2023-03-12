// 51. 
// LeetCode https://leetcode.com/problems/maximum-score-words-formed-by-letters/
// Basically iss question mai we have given some words, some allowed frequncies of characters, score of all alhabets and we need to return max score
// of these words subsets and we have to use only allowed frequencies of characters for this. 

class Solution {
    
    public int maxScore(int idx, String[] words, int[] freq, int[] score){
        if(idx == words.length) return 0;
        
        // yes
        int currScore = 0;
        // flag is to check if we can take that particular word or not 
        boolean flag = true;
        
        // current idx vale word ke characters pr loop lgaya
        for(char ch : words[idx].toCharArray()){
            
            //Uss character ki freq decrease ki
            freq[ch - 'a']--;
            
            // agar decrease krte krte vo negative ho gyi toh flag ko false kr diya
            
            if(freq[ch - 'a'] < 0 ){
                flag = false;
            }
            
            // then uss particular character ka score currentscore mai add kr diya
            currScore += score[ch - 'a'];
        }
        
        // if flag is true mtlb kisi bhi allowed character ki frequency negative nhi hui 
        // toh next call lgao and jo bhi vo result return kre current score m add krlo
        // else means kisi allowed character ki frequency negative ho gyi
        // so we need to exclude teh whole word so currScore for that particular word ko 0 
        // krna pdega ex for word good lets say we have only 1 freq left for o 
        // then we have added score of g and 1 o in current score but bcoz of second o we need to 
        // exclude that whole word so curr score will be 0
        if(flag == true){
            currScore += maxScore(idx + 1, words, freq, score);
        }else{
            currScore = 0;
        }
        
        
        // backtrack 
        for(char ch : words[idx].toCharArray()){
            freq[ch - 'a']++;
        }
        // no
        
        return Math.max(currScore, maxScore(idx + 1, words, freq, score));
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq = new int[26];
        // Storing the frequency of allowed letters
        for(char ch : letters){
            freq[ch - 'a']++;
        }
        
        return maxScore(0, words, freq, score);
    }
}

// TC : 2 raise to the power n + (m * n) where m * n is the preorder work 
// where 2 is the two calls and n is number of words and m is the ek word ki length