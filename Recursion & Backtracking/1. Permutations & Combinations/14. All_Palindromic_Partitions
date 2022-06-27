// 14.
// Pepcoding
import java.util.*;
public class All_Palindromic_Partitions {
    public static boolean isPalindrome(String s){
        int i = 0 ; 
        int j = s.length()-1;
        
        while(i <= j)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 != ch2)
            {
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
    
	public static void solution(String str, String asf) {
	    if(str.length() == 0)
	    {
	        System.out.println(asf);
	        return;
	    }
	    
		for(int i = 0 ; i < str.length(); i++)
		{
		    String s1 = str.substring(0,i+1);
		    String rs = str.substring(i+1);
		    if(isPalindrome(s1))
		    {
		        solution(rs, asf + "(" + s1  + ") ");
		    }
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		solution(str, "");
	}

}

// In  --> pep 
// Out
// (p) (e) (p) 
// (pep) 