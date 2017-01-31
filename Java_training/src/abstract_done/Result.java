package abstract_done;

class implementation extends Result 
{
	public void add()
	{
		int a,b,add_res;
		a=90;
		b=8;
		add_res=0;
		System.out.println("add_res=  "+(a+b)+add_res);
	}
}
 abstract class Result2 
{
	//contain abstract &non-abstract method also.
	//at least 1 abstract method.
	 
	public abstract void add(); //implement in other class.
	public static void disp()
	{
		System.out.println(" I m in non-abstract method of abstract class." );
	}
}
public class Result
{
	public static void main(String[] args)
	{
		implementation obj=new  implementation ();
		obj.add();
		Result2.disp();
	}
}
