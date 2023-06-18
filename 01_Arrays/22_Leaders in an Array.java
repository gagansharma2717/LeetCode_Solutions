class Solution{
   
    static ArrayList<Integer> leaders(int arr[], int n){
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int temp[] = new int[n];
        // last element is already a leader mentioned in promblem statement
        temp[n-1] = arr[n-1];
        
        int max = arr[n-1];
        // finding max for each index element
        for(int i = n-2; i >= 0 ; i--){
            max = Math.max(max, arr[i]);
            temp[i] = max;
        }
        
        // Now the index element if it is greater or equal from its right on that index 
        // difference will be zero on that index so add it to resultant arraylist 
        for(int i = 0 ; i <n; i++){
            if(arr[i] - temp[i] == 0){
                res.add(arr[i]);
            }
        }
        
        return res;
    }
}
