// bit_wise or (|) operator
import java.util.*;
public class q2 {

public static void bitOr(int a,int b){
    System.out.println("the or result is"+(a|b));
}

public static void bitXor(int a,int b){
    System.out.println("the Xor result is "+(a^b));
}
public static void bitNot(int a){
    System.out.println("the not result is "+(~a));
}
public static void leftShift(int a,int b){
    System.out.println("the left shift result is "+(a<<b));
}
public static void rightShift(int a,int b){
    System.out.println("the right shift result is "+(a>>b));
}








 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int a  =sc.nextInt();
    System.out.println("Enter the second number");
    int b = sc.nextInt();
    bitOr(a,b);
    rightShift(a,b);
    bitXor(a,b);
    leftShift(a,b);
 }   
}
