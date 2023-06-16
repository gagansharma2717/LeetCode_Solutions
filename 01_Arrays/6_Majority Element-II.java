// Taking more auxiliary space with hashmap
class Solution {
    public List<Integer> majorityElement(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        
        List<Integer> al = new ArrayList<>();
        for(Integer key : map.keySet()){
            int val = map.get(key);
            if( val > (nums.length/3)){
                al.add(key);
            }
        }

        return al ;
    }
}

O(n) - Time and O(1) aux space
class Solution {
    public boolean isGreaterthanNby3(int[] nums, int val){
        int count = 0 ;
        for(int ele : nums){
            if(ele == val){
                count++;
            }
        }
        return count > nums.length/3 ? true : false;
    }
    public List<Integer> majorityElement(int[] nums) {
        // n % 3 = 0, 1,2 - These elements are possible that can be greater than n/3
        
        int val1= nums[0];
        int cnt1 = 1;

        int val2 = nums[0];
        int cnt2 = 0; //Imp. Only impacting 1st element for now

        for(int i=1; i < nums.length; i++){
            if(val1 == nums[i]){
                cnt1++;
            }else if(val2 == nums[i]){
                cnt2++;
            }else{
                if(cnt1 == 0){
                    val1 = nums[i];
                    cnt1 = 1;
                }else if (cnt2 == 0){
                    val2 = nums[i];
                    cnt2 = 1;
                }else{
                    // Pairing 3 elements
                    cnt1--;
                    cnt2--;
                }
            }
        }

        List<Integer> al = new ArrayList<>();

        if(isGreaterthanNby3(nums,val1) == true){
            al.add(val1);
        } 
        // If both elements are not same and val2 is greater than n/3
        if(val1 != val2 && isGreaterthanNby3(nums,val2) == true){
            al.add(val2);
        }

        return al;
    }
}

