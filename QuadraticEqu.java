import java.util.Scanner;
public class QuadraticEqu{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double a,b,c,root1,root2;
        System.out.print("Enter coefficient of x square: ");
        a = input.nextDouble();
        System.out.print("Enter coefficient of x: ");
        b = input.nextDouble();
        System.out.print("Enter constant value: ");
        c = input.nextDouble();
        double discriminant = b*b-4*a*c;
            root1 = (-b + Math.sqrt(discriminant))/2*a;
            root2 = (-b - Math.sqrt(discriminant))/2*a;
        System.out.print("The roots will be: " +root1+ " and " +root2+ ".");
        input.close();

    }
}