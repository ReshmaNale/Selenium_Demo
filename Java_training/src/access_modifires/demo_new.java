package access_modifires;

class addition
{
	protected int i=20;
	protected void add()
	{
		int a=4;int b=4;
		int sum=a+b;
		System.out.println("a+b= "+sum);
	}
}

public class demo_new
{
	protected static int j;
	protected void  sub()
	{
		//variables in methods are only final or static.
		final int s;
		int m=3;
		int n=8;
		int sub=0;
		sub=m-n;
		System.out.println("m-n= "+sub);
	}
	public static void main(String[] args) 
	{	//we call a protected method in same class also.
		
		addition obj1=new addition();
		obj1.add();
		System.out.println("calling method using demo_new  class object");
		demo_new res=new demo_new();
		res.sub();
		
		}

}
