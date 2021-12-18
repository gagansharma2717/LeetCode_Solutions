class Solution {
    
    public static int lowerbound(int[] arr, int tar)
    {
        int low = 0, high = arr.length-1;
        int ans = arr.length;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] >= tar)
            {
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return ans;
    }
    
    public static int closest(int[] arr, int tar)
    {
        int lb = lowerbound(arr,tar);
        if(lb == arr.length)  return arr[arr.length-1]; //ceil does not exist
        else if(lb == 0) return arr[0]; //floor does not exist
        else if(Math.abs(tar - arr[lb]) < Math.abs(tar - arr[lb-1]))
            return arr[lb];
        else
            return arr[lb-1];
    }
    public int findRadius(int[] houses, int[] heaters) {
        
        Arrays.sort(heaters);
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < houses.length; i++)
        {
            int closestHeater = closest(heaters, houses[i]);
            max = Math.max(max , Math.abs(closestHeater - houses[i]));
        }
        
        return max;
    }
}
