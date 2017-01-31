package practice_basic_prog;

public class Prime_between_range {

	public static void main(String[] args) {
		
				
				
				for(int n=2;n<=50;n++)
				{	
					System.out.println("");
				
				if(isprime(n)==true)
				{
					System.out.printf(" prime No's   %d   ",n);
					//System.out.print();
							
				}
				else
				{

					System.out.print("");
				
					System.out.printf("Not prime No's   %d ",n);
				}
				}
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

	