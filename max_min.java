
import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter the element");
    for(int i = 0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }

    // maximum element
    int max = arr[0];
    for(int i =1;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    System.out.println("the max element"+max);


    // minimum element
    int min = arr[0];
    for(int i =1;i<arr.length;i++){
        if(min >arr[i]){
            min = arr[i];
        }
    }
    System.out.println("the max element"+min);
    }
}
