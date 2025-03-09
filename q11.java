import java.util.*;
public class q11 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the  size first array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the elements of the array");
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }



    System.out.println("enter the size second array");
    int m= sc.nextInt();
    int arr2[] = new int[m];
    System.out.println("enter the elements of the array");
    for(int i = 0;i<m;i++){
        arr2[i] = sc.nextInt();
    }


    int arr3[] = new int[m+n];
    for(int i = 0;i<m;i++){
        arr3[i] = arr2[i];
    }

    for(int i = 0;i<n;i++){
        arr3[m+i] = arr[i];
    }




    System.out.println("the merged array is :");
    for(int i = 0;i<m+n;i++){
        System.out.print(" "+arr3[i]);
    }
   } 
}
