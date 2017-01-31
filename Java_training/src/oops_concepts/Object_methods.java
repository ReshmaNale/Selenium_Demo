package oops_concepts;
public class Object_methods
{
	int a=20;	
	int b=30;				//instance variables;
	String str ="Piu";
	public static void main(String[] args) 
	{

		Object_methods obj=new Object_methods();
		
		System.out.println(obj.a+"    "+obj.str);
		obj.add();
		obj.addition(40, 20);
	}
	public int add()
	{												//without para passing...
		int result=a+b;
		System.out.println("Addition = "+result);
		return result;
	}
	public int addition(int a,int b)
	{												//with para passing...
		int result2=a+b;
		System.out.println("Addition = "+result2);
		return result2;
		
	}
}

