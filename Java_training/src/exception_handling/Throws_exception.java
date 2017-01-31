package exception_handling;
import java.io.IOException;
//throws inform to prog.about exceptio.so he can handle 

public class Throws_exception
{
	void add()throws IOException
	{	
		int a=10/0;
		throw new IOException("Device error...");
	
	}
	void m1()throws IOException
	{
		add();
	}
	void m2()
	{try{
		m1();}catch(Exception e){System.out.println("catched exception..");}
		System.out.println("i m in m2..");
	}
	public static void main(String[] args) 
	{
		Throws_exception obj1=new Throws_exception();
		obj1.m2();
	}

}
