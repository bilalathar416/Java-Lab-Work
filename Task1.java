class Calculator
{
	int add(int a, int b)                                  //Method with two integers as parameters
	{
	return a+b;
	}
	double add(double a, double b)	          //Method with two double values as parameters		
	{
	return a+b;
	}
	int add(int a, int b, int c)	          //Method with three integers as parameters
	{
	return a+b+c;
	}
	void add(String a, String b)	         //Method to concatenate two strings taken as parameters
	{
	System.out.println(a+" "+b);
	}
}
class Task1                                                               // Class name must be same as file name
{
	public static void main(String []args)
	{
	Calculator obj = new Calculator();		// Creating object of Calculator class
	int ResultInt = obj.add(2,3);
	double ResultDouble = obj.add(2.5, 3.0);
	int Result3Int = obj.add(2, 3, 5);
	System.out.println("The addition of two integers 2 and 3 is: "+ResultInt);
	System.out.println("The addition of two integers 2.5 and 3.0 is: "+ResultDouble);
	System.out.println("The addition of two integers 2, 3 and 5 is: "+Result3Int);
	obj.add("String", "Concatenation");
	}
}