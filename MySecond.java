import java.util.Scanner;
public class MySecond {
    public static void main(String[]args){
        int num1, num2, avg;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        num2 = input.nextInt();
        avg = (num1+num2)/2;
        System.out.println("The average of two integers is: "+avg);
        input.close();

    }


    
}
