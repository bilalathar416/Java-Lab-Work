import java.util.Scanner;
public class Sum{
public static void main(String [] args){
int a,b, sum;
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer: ");
a = input.nextInt();
System.out.print("Enter second integer: ");
b = input.nextInt();
sum = a + b;
System.out.print("The sum of " + a + " and " + b + " is " + sum);
input.close();
}
}