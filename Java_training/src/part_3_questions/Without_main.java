package part_3_questions;

public class Without_main 
{
	//main can be FINAL.
	public static final void main(String[]args)
	{
		int a=100;
		
		System.out.println(" a= "+a);
	}
			class b extends Without_main 
		{
		}
		//Static block executed first.
static
{
	int b=1000;
	System.out.println(" b= "+b);
}
}
