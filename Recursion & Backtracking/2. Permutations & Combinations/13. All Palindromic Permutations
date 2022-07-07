// 13.
// Pepcoding https://www.Pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/all-palindromic-permutations-official/ojquestion
// Box on Level

import java.io.*;
import java.util.*;

public class Main {

	public static void generatepw(int currBox, HashMap<Character, Integer> fmap, StringBuilder ans) {
	    // When Current Boxes length is equal to half of string
	    // Means when we reach the mid, print the result
		if(currBox == ans.length()/2){
		    System.out.println(ans);
		    return;
		}
		// Looping on all characters
		for(Character ch : fmap.keySet())
		{
		    // if frequency is greater than 0
	        if(fmap.get(ch) > 0){
	            // Get old frequency from hashmap
	            int oldFreq = fmap.get(ch);
	            // Decrease it by 2 and put it into hashmap
	            fmap.put(ch, oldFreq - 2);
	            // Place items on boxes and boxes and right both sides
	            ans.setCharAt(currBox, ch);
	            ans.setCharAt(ans.length()- 1 - currBox, ch);
	            
	            generatepw(currBox+1, fmap, ans);
	            
	            // Backtracking
	            // Older Frequency put in hashmap
	            // Place 0 in Left and Right boxes
	            fmap.put(ch, oldFreq);
	            ans.setCharAt(currBox, '0');
	            ans.setCharAt(ans.length()- 1 - currBox, '0');
	
	        }	    
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		HashMap<Character, Integer> fmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
		}
		
		// boxes we will reduce it by length/2 and then reverse it so by doing this 
		// I will be able to reduce time by 2^n/2
		// We also need to take care that only one character is allowed to have 
		// odd number of frequency in frequency hashmap from string.
		
		
		// All characters should have even frequency or atmost 1 character with odd frequency
		
		// Finding Odd Frequency Character and If more than one 
		// character of odd frequency exists in hashmap 
		// then print - 1 and return;
		Character oddFreqCh = '0';
		for(Character c : fmap.keySet()){
		    if(fmap.get(c) % 2 == 1){
		        if(oddFreqCh != '0'){
		            System.out.println("-1");
		            return;
		        }
		        oddFreqCh = c;
		    }
		}
		
		
		// asf --> answer so far
		// Appending 0 in stringbuilder equal to string length
		StringBuilder asf = new StringBuilder("");
		for(int i = 0 ; i < str.length(); i++){
		    asf.append("0");
		}
		
		// Placing old frequency character in mid of string builder length and reducing its frequency by 1 in hashmap
		if(str.length() % 2 == 1){
            
		    asf.setCharAt(str.length() / 2 , oddFreqCh);
		    
		    fmap.put(oddFreqCh, fmap.getOrDefault(oddFreqCh, 0) - 1);
		}
		
	    generatepw(0,fmap,asf);	 
	}
	
}