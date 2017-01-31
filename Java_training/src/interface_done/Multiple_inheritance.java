package interface_done;

interface A1
{
	void disp();
	
}
interface B1
{
	void disp2();
	void disp();// No confusion caz implementation provided by implementation class
}


public class Multiple_inheritance implements A1,B1
{
	public void disp()
	{
		System.out.println("Implements A1....");
	}
	public void disp2()
	{
		System.out.println("Implements B1....");
	}
	
	public static void main(String[] args) 
	{
		Multiple_inheritance obj=new Multiple_inheritance();
		obj.disp();
		obj.disp2();
	}

}
