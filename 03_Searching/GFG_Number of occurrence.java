class Solution {
    int count(int[] arr, int n, int x) {
        
        int first = first_occ(arr,x);
        if (first == -1) return 0; 
        int last = last_occ(arr,x);
        
        return last - first + 1;
        
    }    
    
    public static int first_occ(int[]arr, int x)
    {
        int low = 0 , high = arr.length-1;
        
        int ans = -1;
        while( low <= high)
        {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == x)
            {
                ans = mid;
                high = mid - 1;
            }
            else if(arr[mid] < x)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        
        return ans;
    }
    
    public static int last_occ(int[]arr, int x)
    {
        int low = 0 , high = arr.length-1;
        
        int ans = -1;
        while( low <= high)
        {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == x)
            {
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] < x)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        
        return ans;
    }
}
