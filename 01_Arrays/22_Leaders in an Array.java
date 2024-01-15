class Solution{
   
    static ArrayList<Integer> leaders(int arr[], int n){
      
        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = n-1; i >= 0 ; i--){
            if(arr[i] >= max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        
        Collections.reverse(ans);
        return ans;
    }
}
