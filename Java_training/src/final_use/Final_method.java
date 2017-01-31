package final_use;

class my
{
	//Final method inheritted but can't override.
	public final void run()
	{
		System.out.println("Running....");
	}
}

//final method can not be override.
public class Final_method extends my
{
		public static  void main(String[] args)
	{
			
			my d1=new my();
			d1.run();
			
		//static method called directly.
		sub_new();
		Final_method obj=new Final_method();
		obj.mult_new();
		obj.mult_new(2,5);
	}
	//static final method
		static  final void  sub_new()
		{
			 int m,n,sub =0;
			 m=80;
			n=70;
			sub=m-n;
			System.out.println("subtraction =" +sub);
		}
	//non_static final method 
		public final void mult_new()
		{
			 int m,n,mul=0;
			 m=8;
			n=7;
			mul=m*n;
			System.out.println("Multiplication=" +mul);
		}
		//Final methods can be overloaded.
		public final void mult_new(int a,int b)
		{
			
			int mul=a*b;
			System.out.println("Addition=" +mul);
		}
}
