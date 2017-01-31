package constructor;

public class Default_constructor 
{
	int i;
	String name;
	void disply()
	{
		 System.out.println("I m inDisplay method");
			
		System.out.println( i+"   "+name);
	}
	//first call default constructor n then disply method.
	 Default_constructor()
	 {
		 System.out.println("I m in Default constructor");
		 
		 System.out.println(" value of i="+i);
		 System.out.println(" value of name="+name);
	 }
	public static void main(String[] args) 
	{
		
		 Default_constructor  obj=new  Default_constructor ();
		 obj.disply();
		 
	}

}
