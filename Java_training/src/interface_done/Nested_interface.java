package interface_done;

interface d1
{
	void display1();
	
	interface d2
	{
		void display2();
	}
}
public class Nested_interface implements d1.d2
{
	public void display1()
	{
		System.out.println("I m in outer d1 method");
	}
	public void display2()
	{
		this.display1();
		System.out.println("I m in nested d2 method");
	}
	
	public static void main(String[] args)
	{
	d1.d2 obj=new  Nested_interface();
	//d1.d2 obj2=new  Nested_interface();
	obj.display2();
	
	}

}
