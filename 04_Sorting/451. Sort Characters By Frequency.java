//Medium
//Bucket Sort
class Solution {
    public String frequencySort(String s) {
        
        //HashMap Creation and adding characters
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            hm.put(ch , hm.getOrDefault(ch, 0) + 1);
            
        }
       
        //ArrayList Declaration       
        ArrayList<Character>[] buckets = new ArrayList[s.length() + 1];
        for(int i = 0 ; i < buckets.length ; i++)
        {
            buckets[i] = new ArrayList<>();
        }
        
        //Add values in ArrayList 
        for(Character ch : hm.keySet())
        {
            int val = hm.get(ch);
            buckets[val].add(ch);
        }
        
        //Generating Result
        StringBuilder sb = new StringBuilder("");
        for(int b = buckets.length - 1 ; b >= 0 ; b--)
        {
            for(Character ch : buckets[b])
            {
                for(int f = 0 ; f < b ; f++)
                {
                    sb.append(ch);
                }
            }
        }
        
        return sb.toString();
    }
}
