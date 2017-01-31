package interface_done;

interface A
{
	void a1();
	
}
interface B extends A

{
	
	void b1();
	
}
public class Interface_inheritance implements A,B
{
	public void a1()
	{
		System.out.println("I m in a1 method.");
	}
	public void b1()
	{
		System.out.println("I m in b1 method.");
	}
	public static void main(String[] args) 
	{
		Interface_inheritance obj=new Interface_inheritance();
		obj.a1();
		obj.b1();

	}

}
