class Solution {
    public static int LowerBound(int[] arr, int tar)
    {
        int left = 0 , right = arr.length - 1;
        
        int ans = arr.length;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            
            if(arr[mid] >= tar)
            {
                ans = mid;
                right = mid - 1;   
            }
            else
            {
                
                left = mid + 1;
            }
        }
        
        return ans;
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int second = LowerBound(arr,x); //mila toh uska first ouccurence nhi mila toh usse just bdi value ka 1st occurrence
        int first = second - 1;
        List<Integer> res = new ArrayList<>();
        
        //first is going to right to left
        //sedcond is going to left to right
        while(first >= 0 && second < arr.length  && k-- > 0)
        {
            if(Math.abs(arr[first] - x) <= Math.abs(x - arr[second]))
            {
                res.add(arr[first]);
                first--;
            }else{
               res.add(arr[second]);
               second++;
            }
  
        }
        
        //if second is out of bound
        while(first >= 0 && k-- > 0)
        {
            res.add(arr[first]);
            first--;
        }
        
            //if first is out of bound        
         while(second < arr.length && k-- > 0)
        {
           
               res.add(arr[second]);
               second++;
        }
        
        Collections.sort(res);
        return res;
    }
}
