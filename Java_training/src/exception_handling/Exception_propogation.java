package exception_handling;

public class Exception_propogation 
{
	void add()
	{
		int a=10/0;
	}
	void m1()
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
		Exception_propogation  obj=new Exception_propogation ();
		obj.m2();
	}

}
