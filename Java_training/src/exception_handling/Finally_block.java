package exception_handling;

public class Finally_block
{
	public static void main(String[] args) 
	{
		try
		{
			int b[]=new int[8];
			b[12]=70;
		}		
		catch(Exception e)
		{
			System.out.println("I m  found");
		}
		finally
		{
			System.out.println("Always executed...");
		}

	}

}
