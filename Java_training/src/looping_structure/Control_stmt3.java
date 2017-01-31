package looping_structure;

public class Control_stmt3
{

	public static void main(String[] args) 
	{
		int i,m,n,j;
		
		System.out.println("  Break Stmt ......");
		for( i=0;i<=3;i++)
		{

			System.out.println();
			
			for (j=0;j<=3;j++)
			{
			
				if(i==2&&j==2)
				{
					break;   //break current iteration of i=2; from i=2 && j==2;it break only the inner loop;
					
					
				}
				System.out.println("i=" +i +   "  "+ "j ="+ j);
			}
		}
		System.out.println("  Continue  stmt......");
		
			for( m=1;m<=3;m++)
			{

				System.out.println();
				for( n=1;n<=3;n++)
				{
					if(m==2&&n==2)
					{
						continue;
					}
					System.out.println("m=" +m +   "  "+ "n ="+ n);
					
				}
			}
			

			System.out.println();

			System.out.println(" Switch Case......");
		int day=5;
		
		switch(day)
		{
		case 1:

			System.out.println("sunday");
		case 2:
			System.out.println("monday");
		case 3:
			System.out.println("tuesday");
		case 4:
			System.out.println("wednesday");
		case 5:
			System.out.println("Thursday");
		case 6:
			System.out.println("friday");
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("Invalid day...!!!!!");
			
		}
		
		}
	}


	
