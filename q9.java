//  REVERSE THE ARRAY STRING

import java.util.*;
public class q9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
int n = sc.nextInt();

char[] arr = new char[n];
System.out.println("Enter the elements of the array");
for(int i = 0;i<n;i++){
    arr[i] = sc.next().charAt(0);
    System.out.println("the array is"+ arr[i]);
}


System.out.println("the reverse array is");
for(int i=n-1;i>=0;i--){
  System.out.print(arr[i]+" ");
}
  }  
}
