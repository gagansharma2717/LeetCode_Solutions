// 35.
// CodingBlocks https://hack.codingblocks.com/app/practice/1/394/problem
// Simple Permutation with little variations
// First Sort the String input and make a new sorted input then simple permutation code 
// At Base Case, compare string while printing if string is larger than original given input then only print it.

import java.util.*;
public class Main {
    public static void permute(String input, boolean[] visited, String output, String s)
    {
        // string1.compareTo(string2)
        // It returns the following values:
        // if (string1 > string2) it returns a positive value.
        // if both the strings are equal lexicographically i.e.(string1 == string2) it returns 0.
        // if (string1 < string2) it returns a negative value.
        if (output.length() == s.length()) {
            if (s.compareTo(output) < 0 ) {
                System.out.println(output);
            }
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            if (visited[i] == false) {
                visited[i] = true;
                permute(input, visited, output + input.charAt(i), s);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        String s = scn.next();
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        String input = new String(temp);
        String output = "";
        boolean[] visited = new boolean[input.length()];

        permute(input, visited, output, s);
    }
}
