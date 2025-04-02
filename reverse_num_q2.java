//  reverse the given number
public class reverse_num_q2 {
    public static void main(String[] args) {
      int num = 10899;
      int reverse=0;
      while(num>0){
        int lastdigit = num%10;
        reverse = (reverse*10)+ lastdigit;
        num = num/10;
      }
System.out.println(reverse);
    }
}
