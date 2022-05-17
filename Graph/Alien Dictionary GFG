import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String[] words = br.readLine().split(" ");

    System.out.println(alienOrder(words));
  }

  public static String alienOrder(String[] words) {
    // To make graph
    HashMap<Character, HashSet<Character>> map = new HashMap<>(); 
    // For Indegree
    HashMap<Character, Integer> indegree = new HashMap<>();

    String result = "";

    if(words == null || words.length == 0)
    {
      return result;
    }

    // Adding 0 in indegree hashmap for each chracters
    for(String word : words){
      for(char ch : word.toCharArray())
      {
        indegree.put(ch,0);
      }
    }

    for(int i = 0 ; i < words.length-1; i++)
    {
      boolean flag = false;
      String curr = words[i];
      String next = words[i + 1];

      int len = Math.min(curr.length(),next.length());

      for(int j = 0 ; j < len; j++)
      {
        char ch1 = curr.charAt(j);
        char ch2 = next.charAt(j);

        if(ch1 != ch2)
        {
          HashSet<Character> set = new HashSet<>();

          if(map.containsKey(ch1))
          {
              set = map.get(ch1);
          }

          if(!set.contains(ch2)){
            set.add(ch2);
            map.put(ch1,set);
            indegree.put(ch2,indegree.get(ch2)+1);
          }

           flag =  true;
           break;
        }
      }
      
      if(flag == false && next.length() < curr.length()){
          return "";
      }
    }

    Queue<Character> q = new LinkedList<>();
    for(char c : indegree.keySet())
    {
      if(indegree.get(c) == 0)
      {
        q.add(c);
      }
    }

    while(!q.isEmpty())
    {
        char rem = q.remove();
        result += rem;

        if(map.containsKey(rem)){
          for(char c : map.get(rem))
          {
            indegree.put(c,indegree.get(c)-1);
            if(indegree.get(c) == 0)
            {
              q.add(c);
            }
          }
        }
    }

    if(result.length() != indegree.size())
    {
      return "";
    }

    return result;
  }
}
