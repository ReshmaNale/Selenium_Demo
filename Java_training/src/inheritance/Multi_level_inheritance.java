package inheritance;
//Multi_level ....we call method of first using second or  Multi_level_inheritance class.
//THAT means we create object of any sub class to call parent class method.
class first
{
	 int a=30;
	String disp1()
	{
		System.out.println("I m in First class  disp1 method.");
		return null;
	}
}
class second extends first 
{
	 int a;
void add()
{
	System.out.println("I m in add method");
}
	void disp2()
	{
		this.a=40;	//to access same class variables.
//cant use super in static.
		super.disp1();

		System.out.println("I m in Second class  disp2 method."+"   "+"value of a=  "+this.a);
		System.out.println(super.a);
		System.out.println(super.disp1());
	}

}
public class Multi_level_inheritance extends second
{

	public static void main(String[] args)
	{
		second obj2=new second();
		obj2.disp1();
		
		System.out.println("I m in Multi_level_inheritance  class  disp2 method.");
		Multi_level_inheritance obj1=new Multi_level_inheritance();
		obj1.disp2();
	}
}
