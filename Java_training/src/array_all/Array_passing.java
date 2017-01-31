package array_all;

public class Array_passing 
{

	public static void main(String[] args)
	{
		int a[]={10,2,3};
		minvalue(a);

		
		
	}
	
	static void minvalue(int a[])
	{
		

	//int a[]=new int [3];
	int min=a[0];
	
	for(int i=0;i<a.length;i++)
	
		if(min>a[i])
			
		
	
			min=a[i];
			System.out.println(
					"min value in array=  "+
							min);
			
		
		
	
	}
	
	

}
