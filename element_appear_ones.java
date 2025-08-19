
// Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

// Examples

// Example 1:
// Input Format: arr[] = {2,2,1}
// Result: 1
// Explanation: In this array, only the element 1 appear once and so it is the answer.

// Example 2:
// Input Format: arr[] = {4,1,2,1,2}
// Result: 4
// Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.



import java.util.*;
public class element_appear_ones {
    // function to calulate the element
    public static int ones(int nums[]){
        // int count = 0
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
 int count =0;        

        for(int j= 0;j<nums.length;j++){
            if(nums[j] == num){
                count ++;
            }
        if(count ==1){
                return num ;
            }
        }
       
    }
        return -1;
    }



   public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int  nums[] = new int [n];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<nums.length;i++){
        nums[i] = sc.nextInt();
    }
    System.out.println( " it appeared "+ones(nums));
   } 
}
