class Solution {
    public static void convertToWave(int n, int[] arr) {
        for(int i = 0 ; i < n - 1; i++){
            swap(arr,i,i+1); // swap odd and even index elements
            i++; // incrementing second time become we need to iterate only over odd index in case indexes starting with 1 we need to iterate 1, 3 , 5 and so on. Swap odd with even index elements.
        }
    }
    public static void swap(int[] arr, int odd, int even){
        int temp = arr[odd];
        arr[odd] = arr[even];
        arr[even] = temp;
    }
}