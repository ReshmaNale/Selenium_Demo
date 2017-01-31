package looping_structure;
import access_modifires.*;

public class Modifire_demo  extends  demo_new
{
//Super class must be a public to access protected method of super class in other package subclass.
	public static void main(String[] args) 
	{
		Modifire_demo obj = new Modifire_demo();
		
		System.out.println("I m in  Modifire_demo class of  other package " );
		obj.sub();
		obj.j=40;
		System.out.println("value of j="  +j );
		
	}

}
