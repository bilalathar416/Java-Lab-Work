import java.util.Scanner;
public class MyThird{
    public static void main(String[]args){
        long num, reverse;
        long d1, d2, d3, d4, d5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five digit number: ");
        num = input.nextLong();
        d1= num/10000L;
        d2= (num/1000L)%10L;
        d3= (num/100L)%10L;
        d4= (num/10L)%10L;
        d5= (num%10L);
        reverse = d5*10000L+d4*1000L+d3*100L+d2*10L+d1;
        System.out.print("The reverse of entered number is: " +reverse);
        input.close();
    }
}