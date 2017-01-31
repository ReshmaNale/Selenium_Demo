package access_modifires;

public class Variable_methods 
{
	public static void main(String[] args) 
	{
		demo obj=new demo();
		obj.sub();
		
		Variable_methods  obj2=new Variable_methods();
		obj2.sum();
	}
	public void sum()
	{
		int a=4,b=5,sum=0;
		sum=a+b;
		System.out.println(" sum ="+sum);
	}

}
class demo
{	//we can make a variable as a FINAL  only within a ANY  METHOD. Not any other like private or public.
	private int m=30;
	public void sub()
	{
	
	 int a=7;
		int b=9;
		int sub1=a-b;
		System.out.println(" sub= "+sub1);
	}
}