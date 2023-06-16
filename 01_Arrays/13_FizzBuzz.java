class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        int idx = 1;

        while(idx <= n){
          if(idx % 3 == 0 && idx % 5 == 0){
            res.add("FizzBuzz");
          }else if(idx % 3 == 0){
            res.add("Fizz");
          }else if(idx % 5 == 0){
            res.add("Buzz");
          }else{
            res.add(Integer.toString(idx));
          }
          idx++;
        }
        return res;
    }
}