// Implementation of bubble sort
import java.util.*;
public class bubble_sort {


public static void bubble_sort(int arr[]){
    for(int turn=0;turn<arr.length-1;turn++){
        for(int j = 0;j<arr.length-1-turn;j++){
           if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
           }
        }
    }
}

public static void print(int arr[]){
    for(int i= 0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
    }
}




   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array size");
    int n= sc.nextInt();
    int []arr = new int[n];
    System.out.println("enter the elements of the array");
    for(int i = 0;i<arr.length;i++){
    arr[i] = sc.nextInt();
    }

    bubble_sort(arr);
    print(arr);
   } 
}
