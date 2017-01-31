package array_all;

public class Array_demo
{

	public static void main(String[] args) 
	{
				/*********************ONE_D_Array************/
		
		int a[];		//declaration

		a=new int [2];		//instantiation
		
		a[0]=10;
		a[1]=20;	//instantiation
		  
		int  b[]={1,2,3,4,5};	//all in one
		
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		
			
		}
		System.out.println("  ");
		for (int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
			
		}
		

	}

}
