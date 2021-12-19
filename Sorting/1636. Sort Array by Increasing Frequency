//Easy
//Bucket Sort
class Solution {
    public int[] frequencySort(int[] nums) {
    
        //HashMap Creation and adding characters
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++)
        {
            int val = nums[i];
            hm.put(val , hm.getOrDefault(val, 0) + 1);
        }
        
         //TreeSet Declaration
         //TreeSet is OrderSet  
        TreeSet<Integer>[] buckets = new TreeSet[nums.length + 1];
        for(int i = 0 ; i < buckets.length ; i++)
        {
            buckets[i] = new TreeSet<>();
        }
        
         //Add values in ArrayList 
        for(Integer ch : hm.keySet())
        {
            int val = hm.get(ch);
            buckets[val].add(ch);
        }
        
        //Generating Result
        int[] res = new int[nums.length];
        int idx = 0 ;
        
        for(int b = 0 ; b < buckets.length; b++)
        {
            //descendingSet() is for reverse loop in TreeSet
            for(Integer ch : buckets[b].descendingSet())
            {
                for(int f = 0 ; f < b ; f++)
                {
                    res[idx++] = ch;
                }
            }
        }
        
        return res;
    }
}
