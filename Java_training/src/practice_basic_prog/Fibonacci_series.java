package practice_basic_prog;

/******************************Without Recursion***************************/

public class Fibonacci_series
{
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int c,i;
		int count=10;
		
		
		System.out.println("a=  "+a+"  "+ "b=     "+b);
		System.out.println("c= ");
		for(i=2;i<count;i++)
		{

			c=a+b;	
			a=b;
			b=c;
			
				
				System.out.println("   ");
				System.out.print(+c)
				;
		}
		
		
		
			}

}
