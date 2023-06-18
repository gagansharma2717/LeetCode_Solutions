class Solution {
    public int reverse(int x) {
        long finalNum = 0;

        while(x != 0){
          int lastDig = x % 10;
          finalNum += lastDig;
          finalNum *= 10;
          x = x / 10;
        }

        finalNum /= 10; 
        if(finalNum < Integer.MIN_VALUE || finalNum > Integer.MAX_VALUE){
          return 0;
        }

        if(x < 0) // for negative
        {
          return (int) (-1*finalNum);
        }
        
        return (int) finalNum;
    }
}