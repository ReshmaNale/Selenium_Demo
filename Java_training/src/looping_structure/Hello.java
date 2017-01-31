package looping_structure;

public class Hello 
{
	
	public static void main(String[] args)
	{
		 float a=31.5f;
		 int b=24;
		 /*//////////////////////////////////INCREMENT OPERATOR/////////////////////////////*/
		int m=3;
		++m;
		 System.out.println("+m =" + m);
		
		m++;
		
		 System.out.println("m++=" + m);
		 /*//////////////////////////////////DECREMENT OPERATOR/////////////////////////////*/
		 int n=50;
		
		--n;
		int value= n;
		 System.out.println("value =" + value );
		 System.out.println("--n =" + n );
		 
			n++;
			 System.out.println("n++ =" + n );
	/*/////////////////////////////////////////////////////////IMP////////////////////////*/			
		int s=6;
		int value2=s;
		 s--;
			int value3=s;
		 System.out.println("value2 =" + value2);
		 System.out.println("value3 =" + value3);
		 System.out.println("s-- =" + s);
		 /***********************************************************Control STMT***************************************/
		 int  i=1;
		 int j=11;
		 System.out.println("hello java");
		
		 if (a>b)
		 {
			 System.out.println("a is greater");
		 }
		 
		 else if (a<b) 
		{
			System.out.println("b is greater");
		}
		 else
		 {
				System.out.println("both are equals");
		 }
		
		 while(i<5)
		 {
			 System.out.println("value of i = "+i);
				++i;
		 }
		 		 
		 do
		 {	 
			 --j;
			 System.out.println("j =" + j);
			 
		 }while(j>=1);
		 
	}

}
