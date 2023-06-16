class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    { 
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int val : arr){
            if(map.containsKey(val)){
                map.put(val, map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        
        int count = 0;
        for(int key : map.keySet()){
            int val = map.get(key);
            if(val > n/k){
                count++;
            }
        }
        
        return count;
    }
}
