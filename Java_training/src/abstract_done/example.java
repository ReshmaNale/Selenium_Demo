package abstract_done;

public class example 
{
	public static void main(String[] args) 
	{
	my1 obj=new my1();
	obj.disp();
	my2 obj2=new my2();
	obj2.disp2();
	}
}
class my1 extends example
{
	void disp()
	{
		System.out.println("I m in my1 class method. ");
	}
}
class my2 extends example
{
	void disp2()
	{
		System.out.println("I m in my2 class method. ");
	}
}