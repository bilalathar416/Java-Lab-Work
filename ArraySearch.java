import java.util.Scanner;
class ArraySearch
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the size of the array (1,2,3, ...) : ");
	final int size = input.nextInt();
	int arr[] = new int[size];	
	for(int a=0; a<size; a++ )
		{
		System.out.print("Enter "+(a+1)+" value in array: ");
		arr[a] = input.nextInt();
		}
	System.out.println("What do you want to find? \n 1. Minimum \n 2. Maximum");
	System.out.print("Enter your choice (1 or 2): ");
	int choice = input.nextInt();
	if(choice==1)
		{
		int min = arr[0];
		for(int i=1; i<arr.length; i++)
		{
		if(arr[i]<min)
			{
			min= arr[i];
			}
		}
	System.out.print("The minimum value of array is: "+ min);
		}
	if(choice==2)
		{
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
		if(arr[i]>max)
			{
			max= arr[i];
			}
		}
	System.out.print("The maximum value of array is: "+ max);
		}
	else
	{
	System.out.print("Inavlid Choice!");
	}
	}
}