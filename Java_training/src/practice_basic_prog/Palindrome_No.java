package practice_basic_prog;

public class Palindrome_No 
{

	public static void main(String[] args) 
	{
		int num=444;
		int temp;
		int rem=0;
		int div;
		int res=0;
		while(num>0)
			
		{
		rem=num%10;
		res=(res*10)+rem;
		num=num/10;
		}
		
		System.out.println("Reverse no = " +res);
		
	
	temp=num;
	
	if(temp==res)

		System.out.println("No is Palindrome");
		
	
	else
	
		System.out.println(" Not Palindrome");
		

		

	
	}
}



