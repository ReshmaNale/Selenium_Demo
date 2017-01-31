package exception_handling;

public class Nested_catch
{
	public static void main(String[] args) 
	{
		try{
	
	try
	{
		int a=10/0;
	}catch(ArithmeticException e)
	{
		System.out.println("exception occoured...");
	}
	
	try{
		int a[]=new int[5];
		a[7]=12;
		
	}catch (ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception found..");
	}
		}
	catch(Exception e)
	{
		System.out.println("Exception handled..");
		}
	
		System.out.println("Normal Flow...");
	}
}
