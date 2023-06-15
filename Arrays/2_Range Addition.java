// 370. Range Addition - Locked
public class Main{
    public int[] getModifiedArray(int length, int[][] queries){
        int[] res = new int[length];

        // impact in resultant array  
        for(int q = 0 ; q < queries.length; q++){
            int stpt = queries[q][0];
            int endpt = queries[q][1];
            int inc = queries[q][2];

            res[stpt] += inc;

            // To handle last index to avoid null pointer exception
            if(endpt < res.length){
                res[endpt + 1] -= inc;
            }
        }

        // prefix sum
        int sum = 0;
        for(int i = 0 ; i < length; i++){
            sum += res[i];
            res[i] = sum;
        }

        return res;
    }
}