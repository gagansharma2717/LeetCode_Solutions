//Medium
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         //HashMap Creation and adding characters
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++)
        {
            int val = nums[i];
            hm.put(val , hm.getOrDefault(val, 0) + 1);
        }
        
        
        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
        for(int i = 0 ; i < buckets.length ; i++)
        {
            buckets[i] = new ArrayList<>();
        }
        
         //Add values in ArrayList 
        for(Integer ch : hm.keySet())
        {
            int val = hm.get(ch);
            buckets[val].add(ch);
        }
        
        //Generating Result
        int[] res = new int[k];
        int idx = 0 ;
        
        for(int b = buckets.length - 1; b >= 0 ; b--)
        {
           
            for(Integer ch : buckets[b])
            {
                    res[idx++] = ch;
                    if(idx == k) return res;
            }
        }
        
        return res;
    }
}
