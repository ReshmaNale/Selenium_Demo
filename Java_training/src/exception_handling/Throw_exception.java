package exception_handling;
import java.lang.*;
public class Throw_exception
{
static void age(int a) throws Exception 
{
	if(a<10)
	{
		throw new Exception("i m error..") ;
	}
	else
	{
		System.out.println("welcm..");
	}
}
	public static void main(String[] args) throws Exception
	{
					age(80);
	}

}
