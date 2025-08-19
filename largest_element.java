// WAP to print the largest element in the array
import java.util.*;
public class largest_element {

// function to print the largest
 public static int largest(int arr[]){
    int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]> max){
            max = arr[i];
        }
    }
    return max;
 }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[] ={1,3,5,7,4,8};
        System.out.println(largest(arr));
    }
}
