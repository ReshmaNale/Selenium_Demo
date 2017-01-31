package inheritance;

 class A1
 {
		public void disp_A()
		{
			System.out.println("I m in display method of  parent or super class.");
		}
 }
 
 class B1 extends A
 {
	 
		public void disp_B()
		{
			System.out.println("I m in display method of  parent or super class.");
		}
	 void add()
	 {
		 int s=5,t=6,k=0;
				 System.out.println(" Addition= "+(s+t));
	 }
	
 }
 class C1  extends A 
 {
		public void disp_C()
		{
			System.out.println("I m in display method of  parent or super class.");
		}
	 void sub()
	 {
		 int s1=5,t1=6,k1=0;
		 System.out.println(" subtraction= "+(s1-t1));
	 }
 }
public class Hierachical_inheritance2 
{
	public static void main(String[] args)
	{
B1 obj1=new B1();
obj1.disp_B();
obj1.add();
C1 obj2=new C1();
obj2.disp_C();
obj2.sub();

	}

}
