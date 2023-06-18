class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        for(int i = 0 ; i < nums.length; i++){
          arr[i] = nums[i] + "";
        }

        Arrays.sort(arr,(a,b) -> (a+b).compareTo(b+a));
           // 1 if a+b is greater
           // -1 if b+a is greater
           // 0 if both are equal

        StringBuilder sb = new StringBuilder("");
        for(int i = arr.length-1; i >= 0 ; i--){
          sb.append(arr[i]);
        }

        if(sb.charAt(0) == '0'){
          return "0";
        }

        return sb.toString();
    }
}