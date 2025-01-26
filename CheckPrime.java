/*Program which enables the user to enter a number and it tells either the number is prime or not */
import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, flag=0,i;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        for(i=2; i<num; i++){
            if(num%i==0){
                flag = 1;
                break;
            }

        }
        if(flag==0){
            System.out.print("The number "+num+" is a prime number.");

        }
        if(flag==1){
            System.out.print("The number "+num+" is not a prime number.");
        }
        input.close();
    }
}