package static_all;


//In Java we  can not make a outer class a s a static class instead we can make it as final.

class Nested_static_class    
 {		
	static int d=60;						/************Static Variable*********/
	
	int k2=91;
	int k=90;									/*************Instance or Non-Static variable************/

	
	/**************************************STATIC METHOD*********************/
	static void   display()
	  {
	      //Static method called in non-static method
		System.out.println("I m in staic method");	
		
	  }
					/********************************************************NESTED STATIC CLASS****************************************************/
	static class demo
	{																	//Static Class  contain only  STATIC  methods and STATIC Members.
		
		static 	int a=100;
		static 	int s=50;

		public	static void   MyMethod()
		{
			a=10;
			System.out.println("Inner static method1");
			System.out.println("value of a= "+a);
			System.out.println("value of d= "+d);	
			
		}
	 
	public static void check()
	 {
		 
		 System.out.println("Inner static method2");
		 System.out.println("value of s=" +s);
	 }
			
	}
	
	public static void main(String[] args)
	 {
					//Instance Members;
		int p=10;
	
/**********************************calling nested static class***************************/
		
		Nested_static_class.demo nested=new 	Nested_static_class.demo();
		 nested.MyMethod();
		 
		 Nested_static_class.demo nested2=new 	Nested_static_class.demo();
		 nested2.check();
		 
	System.out.println("value of p= " +p);
	
	
	/************************Important*******************************
	 * Static Methods can access class variables without using object of the class.
	 *  It can access non-static methods and non-static variables by using objects. 
	 * Static methods can be accessed directly in static and non-static methods.
	 */
	Nested_static_class  object= new Nested_static_class ();
																																				
	System.out.println("value of k= "+object.k);
	
		System.out.println("value of d= "+d);	
display();

		//Control_stmt2  object2= new Control_stmt2 ();
		 //object2.k2; 
//	 Control_stmt2   obj=new  Control_stmt2 ();	//A static method cannot access instance members of a class,"
//	 obj.k;
	 
	 }
 }



