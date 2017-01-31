package constructor;

class Parametrs_constructor 
{
	int a,b,result,n,m,result2;
	int id,marks;
	int roll,total_marks;
	String address;

	//default constructor
	Parametrs_constructor ()	
	{
	m=4;
	n=7;
	}
	
	//parameterize_constructor with 2 parameters.
 Parametrs_constructor (int s,int t)	
	{
	 	id=s;
	 	marks=t;
	}
 void disp () {    System.out.println("value of id="+id+ "   "+"value of marks= "+marks);    }
 
	
	//parameterize_constructor with 3 parameters.
 Parametrs_constructor (int h,int i,String j)
 {
	  roll=h;
	  total_marks=i;
	 address=j; 
 }
 void disp2 () {    System.out.println("value of roll no="+roll+ "   "+"value of total_marks= "+total_marks+"  Address= "+address);    }
 
//m and n takes default values.
	int subtraction()
	{		
		result2=n-m;
		System.out.println("Result2 ="+result2);
		return result2;
	}
	
	//a an takes provided values.
	int addition(int a,int b)
	{
		result=a+b;
		System.out.println("Result ="+result);
		return result;
	}

	public static void main(String[] args)
	{
		Parametrs_constructor obj =new Parametrs_constructor ();
		obj.addition(1, 5);
		obj.subtraction();
		Parametrs_constructor obj2 =new Parametrs_constructor (23,6657);
		 obj2.disp();
		 Parametrs_constructor obj3 =new Parametrs_constructor (23,567,"pune");
		 obj3.disp2();
	
		
	}
}
