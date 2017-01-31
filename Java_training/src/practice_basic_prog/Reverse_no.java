package practice_basic_prog;

public class Reverse_no 
{

	public static void main(String[] args)
	{
		int n=653;
		int res=0;
		int reminder;
		int div;
		
		while(n>0)
		{
			reminder=n%10;
			res=res*10+reminder;
			n=n/10;	
		}
	System.out.println("reverse no is= "+res);	
	}

}
