class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        // int sum = 0;
        // for(int val : arr){
        //   sum += val;
        // }

        int sum = Arrays.stream(arr).sum();
        
        if(sum % 3 != 0){
          return false;
        }

        int partitionSum = sum/3;
        int tempSum = 0;
        int partitions = 0;

        for(int i = 0 ; i < arr.length; i++){
            tempSum += arr[i];

            if(tempSum == partitionSum){
              partitions++;
              tempSum = 0;
            }

            if(partitions == 3)
            {
              return true;
            }
        }

        return false;
    }
}