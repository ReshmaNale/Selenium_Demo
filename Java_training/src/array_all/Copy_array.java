package array_all;

public class Copy_array 
{
	public static void main(String[] args)
	{
		/************Copying one_d_array***/
		int a[]= {11,12,13,14,15};
		int b[]=new int[5];
		
	System.out.println("original array=a[]");
	for(int i=0;i<5;i++)
	{
		System.out.println(a[i]);
	}
	
	System.out.println("copied array=b[] ");
	for(int i=0;i<5;i++)
	{
		b[i]=a[i];
		System.out.println(b[i]);
	}
	
	/**************Copying 2_d_array*****/
	
		int m[][]={{1,2},{4,5},{7,8,}};
		
		int n[][]=new int[3][2];	//imp it is 2_d array so,2[]brackets;

		System.out.println("copied array ="+m.length +n.length);
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				n[i][j]=m[i][j];
				System.out.print("  "+n[i][j]+"  ");
			}
			System.out.println("   ");
		}
		
	}
	
}

