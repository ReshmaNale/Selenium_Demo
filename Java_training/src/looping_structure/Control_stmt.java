package looping_structure;

public class Control_stmt
{

	public static void main(String[] args) 
	{
		
		
		for( int k=10;k>=0;k--)
		{
			System.out.println("value of a=" +k);
		}
/*********************************Array Elements******************/		
		System.out.println("value of array variable=" );
		int arr[]={11,12,13,14,15};
		
for(int i:arr)
{
	System.out.println("value of i= "+ i);
}
/**********************************labled array********************/
System.out.println("value of a and b=" );
first_loop:
	
for(int a=50;a>40;a++)
{
	second_loop:
		for (int b=50;b>41;b++)
		{
			if(a==50 &&b==61)
			{
				break first_loop;
				
			}
			System.out.println("value of a= " + a   +"   "  +"value of b="   +  b);
		}
}	

/*************************************TABLE*************************/

System.out.println("Multiplication Table=" );

for(int i=1; i<=10 ;i++)
{
		
//	System.out.println(" \n");
		
	for (int j=1;j<=10;j++)
		{
			//The println("...") method prints the string "..." and moves the cursor to a new line. The print("...") method instead prints just the string "...", but does not move the cursor to a new line.
		//Hence, subsequent printing instructions will print on the same line. The println() method can also be used without parameters, to position the cursor on the next line.


			System.out.print(" "+ i*j+" ");
		}
		System.out.println();
		
}
	}

}
