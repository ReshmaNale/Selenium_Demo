package constructor;
public class Access_on_constructor extends super_class
{
			//Private constructor
	  private  Access_on_constructor()
		{

			 System.out.println("I m in PRIVATE constructor of Sub class.");
		 
		}
	
	public static void main(String[] args) 
	{
		Access_on_constructor obj=new Access_on_constructor();
		obj.mult();
		//To call protected constructor of Super class  we have to create obj of super class.
		super_class obj2=new super_class("piu");		//constructor never inherited,so we hav to create obj of super class.
	}
}
 class super_class
 {
	private int s,t,ans;
	private String name;
	
			//Protected  parameterize constructor
	protected super_class(String s)
	 {
		name=s;
		System.out.println("name= "+name);
		 System.out.println("I m in PROTECTED  parameterize  constructor of Super class.");
	 }
			//public default constructor
	public super_class()
	 {
		 System.out.println("I m in  PUBLIC default constructor of Super class.");
	 }
	
	 void mult()
	 {
		 s=2;
		 t=4;
		 ans=s*t;
		 System.out.println("answer= "+ans);
	 }
 }