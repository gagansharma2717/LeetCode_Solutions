// Moore's Vooting Algorithm
// O(n) - Time and Space
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        
        int res = 0;
        for(Integer key : map.keySet()){
            int val = map.get(key);
            if( val > (nums.length/2)){
                res = key;
            }
        }

        return res ;
    }
}


// O(n) - Time and O(1) - Space
class Solution {
    public int findPotentialCandidate(int[] nums){
        // took 1st element of array
        int val = nums[0];
        int cnt = 1 ;

        for(int i = 1 ; i < nums.length; i++){
            // Increasing count if same element found
            if(val == nums[i]){
                cnt++;
            }else{
                // else mapping val with distinct element
                cnt--;
            }

            // While mapping if count becomes zero then update val and count with new element at ith index.
            if(cnt == 0){
            val = nums[i];
            cnt = 1;
            }
        }

        return val;
    }
    public int majorityElement(int[] nums) {
        //finding potential candidate for majority element
        int value = findPotentialCandidate(nums);
        int res = 0;

        // Checking frequency of only potential candidate
        int freq = 0 ; 
        for(int i = 0 ; i < nums.length; i++){
            if(value == nums[i]){
                freq++;
            }
        }

        // Checking if potential candidate is majority element or not
        if(freq > nums.length/2){
            res = value;
        }

        return res;
    }
}

