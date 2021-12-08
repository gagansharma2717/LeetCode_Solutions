/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //Google Interview Question
        //Category of Interactive based problems
        
        int left = 0 , right = n , ans = -1;
        
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            
            if(isBadVersion(mid) == false)
            {
                left = mid + 1; //abhi tak bad version nhi mila
            }
            else
            {
                ans = mid; //true aaya toh potential answer mark kiya
                right = mid - 1; //then left m check kiya
            }
        }
        
        return ans;
    }
    
}
