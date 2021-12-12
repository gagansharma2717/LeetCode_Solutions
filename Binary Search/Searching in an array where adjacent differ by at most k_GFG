class Complete{
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int target, int k) {
        int idx = 0;
        
        while(idx < n)
        {
            if(arr[idx] == target) return idx; //element mila
            
            int minjump = (Math.abs(target - arr[idx])) / k; // jump nikala
            
            if(minjump == 0) minjump = 1; // corner case 
            
            idx = idx + minjump; // jump lga di
        }
        
        return -1; // nhi mila toh
    }
}
