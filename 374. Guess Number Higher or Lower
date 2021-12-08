public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 0 , right = n ;
    
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            
            int ans = guess(mid);
            if(ans == 0) return mid; //0: The number I picked is equal to your guess (i.e. pick == num).
            else if(ans == -1) right = mid - 1; //-1: The number I picked is lower than your guess (i.e. pick < num).
            else left = mid + 1;//1: The number I picked is higher than your guess (i.e. pick > num).
        }
        
        return -1; // \will not execute just for code completion
    }
}
