package practice_basic_prog;

public class Fibonacci_series_recursion 
{

	static int m=0,n=1,p;

	
public static void print(int count)
		 {
	

				 if(count>0)
				 {
					 	p=m+n;
					 	m=n;
					 	n=p;
					 	System.out.println("p= "+p);
						print(count-1);
							
			
				 }
		
				 System.out.println("");
		 
				 
			 }
		 
		public static void main(String[] args)
		{
			int count=10;
			System.out.println("m= "+m+"   "+"n=  "+n);
			print(count-2);
			
		
		}


}