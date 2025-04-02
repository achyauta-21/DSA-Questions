
//  print reverse of a number

import java.util.*;
public class reverse_num {
  public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
System.out.println("Enter the number: ");
int num = sc.nextInt();

while(num>0){
    int lastdigit = num%10;
    System.out.print(lastdigit);
    num = num/10;

}
  }  
}
