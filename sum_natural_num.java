
//  sum of first N natural number
import java.util.*;
public class sum_natural_num {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
int natural=1;
int sum =0;
while(natural <=n){
sum += natural;
natural++;
}
System.out.println("The sum of the number is: "+sum);

   } 
}
