package method_loding_riding;

 class Result_method
{
	 //protected int d1=30;
	static int sum;
	/******************Over_Riding  addition method with 2 parameters in inherited class****************/
	public static int addition(int m,int n)
	{
		sum=m+n;
		System.out.println("Addition= " +sum);
		return sum;
	}
	
	/******************Over_Riding  display method without parameters in inherited class****************/
	public static void display()
	{
		System.out.println("I m overriding method....Hiiiiiiiiiii...");
	}
}
public class Overriding_methods  extends Result_method
{ 
	/***********************Over_Loading subtraction method in same class*********************/
	static int sub,sub2,sum3;
	
	public static int subtraction(int s,int p)
	{
		sub=s-p;
		System.out.println(" subtraction= "+sub);
		return sub;
	}
	public static int subtraction(int m,int n,int k)
	{
		sub2=m-n-k;
		
		System.out.println("subtraction= " +sub2);
		return sub2;
	}
	/***********************Over_Loading end*********************/
	public static int addition(int m,int n)
	{
		sum3=m+n;
		
		System.out.println("Additio_of_no= " +sum3);
		return sum3;
		
	}
	public static void display()
	{
		System.out.println("Hello...");
	}
		public static void main(String[] args) 
		{
			display();
			//create obj of super class to call  superclass methods.
	Result_method.display();
		
			addition(4,5);
		//	Result_method.addition(2, 3);
		
			subtraction(70,20);
			subtraction(70,20,10);
		}
	}

