public class Solution {
    public int solve(int[][] A) {
        int[] startArr = new int[A.length];
        int[] endArr = new int[A.length];

        for(int i = 0 ; i < A.length; i++)
        {
            startArr[i] = A[i][0];
            endArr[i] = A[i][1];
        }

        Arrays.sort(startArr);
        Arrays.sort(endArr);

        int roomCount = 0 , i = 0 , j =0;

        while(i < startArr.length)
        {
            if(startArr[i] < endArr[j])
            {
                roomCount++;
                i++;
            }
            else
            {
                i++;
                j++;
            }
        }

        return roomCount;
    }
}
