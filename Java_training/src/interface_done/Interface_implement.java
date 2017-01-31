package interface_done;

interface print
{
	public static final int a=10;
	public abstract void disp();
	 void add();
}
public class Interface_implement  implements print
{
//The java compiler adds public and abstract keywords before the interface method and 
	//public, static and final keywords before data members.
	
	public  void disp()
	{
		System.out.println("I m in implemented class.");
	}
	public void add()
	{
		int a=2,b=4,sum;
		System.out.println("Sum ="+(a+b));
	}
	
	public static void main(String[] args) 
	{
		 Interface_implement obj=new  Interface_implement();
		 obj.add();
		 obj.disp();
	}
}
