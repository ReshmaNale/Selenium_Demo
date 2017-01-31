package array_all;

public class Two_d_addition
{

	public static void main(String[] args) 
	{
		int i,j;
		int c1[][]=new int [3][3];
		
		int a1[][]={{1,2,3},
							{5,6,7},
							{8,9,10}};
		
	int b1[][]={{1,2,3},
						{5,6,7},
						{8,9,10}};
		
		for(i=0;i<a1.length;i++)
		{
	
			for(j=0;j<b1.length;j++)
			{
			
				c1[i][j]=a1[i][j]+b1[i][j];
		
				System.out.print(c1[i][j]);

				System.out.print("   ");
				
				
			}
			
			
			System.out.println("   ");
		}
		
	}

}
