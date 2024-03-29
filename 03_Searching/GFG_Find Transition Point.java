//https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1

class GfG {
    int transitionPoint(int arr[], int n) {
        // Binary Search
        int left = 0, right = n - 1;
        int ans = -1;
        
        while(left <= right)
        {
            int mid = left + (right - left ) / 2;
            
            if(arr[mid] == 0)
            {
                left = mid + 1;
            }
            else
            {
                ans = mid;
                right = mid - 1;
            }
        }
        
        return ans;
    }
}
