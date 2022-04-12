// Boxes on Level
//Medium
class Solution {
    
    //ipsf -- > items placed so far
    public void combine(List<List<Integer>> combinations, List<Integer> combination, int currBox, int n, int k)
    {
        
        //Base Case   
        if(currBox == n)
        {
            if(combination.size() == k)
            {
                //deep copy
                // bcoz we are remove reference after call so wecannot shallow copy it
                List<Integer> temp = new ArrayList<>(combination);
                combinations.add(temp);
            }
            return;
        }
        
        //options --> current box --> items should be placed or not 
        
        //yes
        combination.add(currBox + 1);
        combine(combinations, combination, currBox + 1, n , k );
        combination.remove(combination.size() - 1);
        
        
        //no
        combine(combinations, combination, currBox + 1, n , k );
        
    }
    public List<List<Integer>> combine(int n, int k) {
        //2d ArrayList initailzed with arraylist all combinations
        List<List<Integer>> combinations = new ArrayList<>();
        //current combination
        List<Integer> combination = new ArrayList<>();
        
        
        combine(combinations, combination, 0, n, k);
        
        return combinations;
    }
}