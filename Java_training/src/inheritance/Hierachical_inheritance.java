package inheritance;
//Hierachical inheritance....we can call method of class A using any object of class B OR Hierachical_inheritance.
class A
{
	int t;
	public void disp1()
	{
		this.t=10;
		System.out.println("I m in display method of  class A."+"   "+"value of t=  "+t);
	}
}
class B extends A
{
	
	public void disp2()
	{
		super.disp1();
		
		System.out.println("I m in display method of  class B.");
	}
}
public class Hierachical_inheritance extends A
{
	public static void main(String[] args) 
	{
		B obj1=new B(); 
		obj1.disp1();
		obj1.disp2();
		Hierachical_inheritance obj2=new Hierachical_inheritance();
		obj2.disp1();
	
	}

}
