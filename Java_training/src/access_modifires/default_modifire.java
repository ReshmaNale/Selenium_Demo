package access_modifires;

public class default_modifire extends myclass
{
	public static void display()
	{
		default_modifire ob1=new default_modifire();
		ob1.mult(3, 3);
		ob1.sample=44;
		System.out.println("value of sample="+sample);
	}
	public static void main(String[] args) 
	{		// sub method accessable from class {Variable_methods }] class caz it has default access
		demo object=new demo();
		object.sub();
		// protected mult method of class {myclass } called from same package but in subclass or derived class {default_modifire}.
		//by using object of any class not issue.
		
		default_modifire ob=new default_modifire();
		ob.mult(2,6);	//using derived class obj;
		ob.display();		//using static method dispay
		ob.sam=11;
		
		myclass ob2=new myclass();
		ob2.mult(3, 7);//using super class obj;
		
		ob.x=10;
		ob.y=300;
		System.out.println("value of x= "+x);
		System.out.println("value of y= "+y);
		
	}

}
class myclass 
{	
	//protected members;
		protected  static int x;
		protected   static int y;
		protected int mul=0;
		protected int sam;
		protected static  int sample;
	protected int mult(int x,int y)
{
	mul=x*y;
	System.out.println(" multiplication= "+mul);
	return mul;
}
}