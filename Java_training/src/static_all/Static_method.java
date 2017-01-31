package static_all;

public class Static_method
{
	public static void main(String[] args)
	{
		//calling Instance method from static method
	//obj is a local variable just to call instance method.
		Static_method obj=new Static_method();
		obj.sum();
		sub(100,50);				//call directly without obj.
		}
public int sum()
{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println("sum= "+sum);
	return sum;
}
public  static void sub(int a1,int b1)
{
	//a1,b1 =local variables
	//a11,b11=Instance variables.
	int a11=20;
	int b11=10;
	int sub=a1-b1;
	int sub2=a11-b11;
	System.out.println("subtraction= "+sub);
	System.out.println("subtraction2= "+sub2);
	}
}

