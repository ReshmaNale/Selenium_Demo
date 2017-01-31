package abstract_done;

public class implement
{
	public static void main(String[] args)
	{
		//I can create only REFERENCE of abstract class.
		implement1 obj2=new new1();
		
//	new1 obj2=new new1();
	obj2.mul();
	implement1.sub();	
	}
}
 abstract class implement1 
{
	// non-abstract methods.
	static int sub()
	{
		int s,t,sub1;
		s=2;
		t=50;
		//sub1=0;
	sub1=t-s;
		System.out.println("sub1= "+sub1);
		return sub1;
	}
	//abstract method.
	abstract int mul();
}
class new1 extends implement1 
{
	int mul()
	{
		int a,k,mult;
		a=8;
		k=4;
		mult=0;
		mult=a*k;
		System.out.println(" multiplication= "+mult);
		return mult;
		
	}
}