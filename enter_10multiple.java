//  Keep entering the number till user enters a multiple of 10


import java.util.*;
public class enter_10multiple {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        do { 
            System.out.print("enter the number:");
            int num = sc.nextInt();
           if(num%10==0){
            break;
           }
           System.out.println(num);

         }
          while (true);
    }
    
}
