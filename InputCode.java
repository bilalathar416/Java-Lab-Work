import java.util.Scanner;
public class Main{
public static void main(String [] args){
int a,b, sum;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an integer: ");
a = scanner.nextInt();
System.out.print("Enter second integer: ");
b = scanner.nextInt();
sum = a + b;
System.out.print("The sum of " + a + " and " + b + " is " + sum);
scanner.close();
}
}