class AreaCalculator                                
{
	int calculateArea(int a)		//Method with an integer as parameter
	{
	return a*a;
	}
	int calculateArea(int a, int b)	//Method with two integers as parameters
	{
	return a*b;
	}
	double calculateArea(double r)	//Method with a double value as parameter
	{
	return (3.14*r*r);
	}
}
class Task2
{
	public static void main(String []args)
	{
	AreaCalculator obj = new AreaCalculator();		//Creating object of the class AreaCalculator
	int SqrArea = obj.calculateArea(5);
	int RecArea= obj.calculateArea(4,5);
	double CircleArea = obj.calculateArea(2.5);
	System.out.println("The area of a square of side length 5cm is: "+SqrArea+" sq.m");
	System.out.println("The area of a rectangle of sides' length 5cm and 4cm is: "+RecArea+" sq.m");
	System.out.println("The area of a circle of radius 2.5cm is: "+CircleArea+" sq.m");
	}
}