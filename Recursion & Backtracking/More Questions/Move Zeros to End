// PepCoding https://www.pepcoding.com/resources/online-java-foundation/leetcode/move-zeroes/ojquestion


import java.util.*;
 
 public class Main {
     
     // Basically iss question m we are traversing nums array with the help of idx and we are maintaining count of non zero elements if we found non zero element then we place that element to nums[countOfNonZeros] and make next call and increase count of NonZeros. 
    // Basically non zeros element place krte gaye traverse krte hue
    // In Base Case we have count of non zeros and total size of array from this count of zeros find kiya
    // then ulta loop lgakr utni zeros place krdi array ke end m 
     public static void moveZeros(int idx, int countOfNonZero, int[] nums){
        if(idx == nums.length){
            int countOfZeros = nums.length - countOfNonZero;
            for(int i = 0 ; i < countOfZeros; i++){
                nums[nums.length-1-i] = 0;
            }
            return;
        } 
        
        if(nums[idx] != 0){
            nums[countOfNonZero] = nums[idx];
            moveZeros(idx+1, countOfNonZero + 1, nums);
        }else{
            moveZeros(idx+1, countOfNonZero, nums);
        }
         
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int[] arr = new int[N];
 
         for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
         }
 
         moveZeros(0,0,arr);
         display(arr);
     }
 
     // function to display an array.
     public static void display(int[] arr) {
 
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
 
         System.out.println();
     }
 }

