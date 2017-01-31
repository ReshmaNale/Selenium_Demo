package practice_basic_prog;

public class prime_no_sum
{
static int sum=0,add=0;
	public static void main(String[] args) 
	{		
		
				//int n=17;
				int n;
				
				
				
				for(n=2;n<=7;n++)
	{
						
				if(isprime(n)==true)
				{
					
					System.out.printf(" prime No's %d ",+n);
					System.out.println(" ");
					sum=sum+n;
				
					}
				
				if(isprime(n)==false)
								
				{

					System.out.print("");
				
					System.out.printf("Not prime No's   %d ",n);
					System.out.println(" ");
					add=add+n;
				}
						
				
	}
				System.out.printf(" Sum of prime No's   %d   ",sum);
				System.out.println("  ");
				
				System.out.printf(" Addition of not prime No's   %d   ",add);
				System.out.println("  ");
				
				
	}
			public static boolean isprime(int n)
		{
				if(n<2)
					return false;
				for(int i=2;i<=n-1;i++)
				{
					if(n%i==0)
					{
						return false;
						
					}
				}
				return true;
			
		}


	}

