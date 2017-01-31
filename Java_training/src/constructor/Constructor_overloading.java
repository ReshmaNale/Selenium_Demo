package constructor;

public class Constructor_overloading 
{
	int a,b,add;
	int val;
	String n1,n2;

	
	public  Constructor_overloading (int value1,int value2)
	{
		a=value1;
		b=value2;
	}
	 void disp1 () {    System.out.println("value of a="+a+ "   "+"value of b= "+b);    }
	 
	public Constructor_overloading(String name,String address,int m1)
	{
		n1=name;
		n2=address;
		val=m1;
	}
	 void disp2 () {    System.out.println("value of  n1="+n1+ "   "+"value of n2= "+n2 + "  value of val= "+val);    }
	 
	public static void main(String[] args) 
	{
		Constructor_overloading  obj=new Constructor_overloading (2,4);
		obj.disp1();

		Constructor_overloading  obj2=new Constructor_overloading ("Piu","Nale",67);
		obj2.disp2();
		
	}

}
