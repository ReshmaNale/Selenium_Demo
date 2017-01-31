package abstract_done;

public class Abstract_data_members 
{
//An abstract class can have data member, abstract method, 
	//method body, constructor and even main() method.
	public static void main(String[] args) 
	{
		data_all object=new my();
		object.disp();
		data_all .disp2();
	}
}
class my extends data_all
{
	void disp()
	{
		System.out.println("I m in abstract method.");
	}
}

abstract class data_all
{//constructor
	data_all()
	{
		System.out.println("I m in abstract class constructor.");
	}
	//abstract method.
	abstract void disp();
	//normal method non-abstract.
	 static void disp2()
	{
		System.out.println("I m in Non-abstract method");
	}
}