package inheritance;

class single
{
	public void disp()
	{
		System.out.println("I m in display method of  parent or super class.");
	}
	
}
public class Single_inheritance  extends single
{
	public static void main(String[] args) 
	{
		single o=new single();		//called by obj of super class.
		o.disp();
		 Single_inheritance obj=new  Single_inheritance();				//called by obj of sub class.
		 obj.disp();
	}

}
