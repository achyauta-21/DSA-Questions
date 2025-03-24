
import java.util.*;

public class q3 {

public static void oddEven(int n){
    int bitMask = 1;
    if((n&bitMask)==0){
        System.out.println("it is even");
    }
    else{
        System.out.println("it is odd");
    }
}


   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    oddEven(n);
   } 
}
