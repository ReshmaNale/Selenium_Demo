package final_use;

public class Final_variable
{
	final static int k=5;
	public static void main(String[] args) 
	{
		
		Final_variable obj1=new  Final_variable();
		obj1.add();
		
				
		
		
	}
	
void add()
{
	//In method defination for variable only final  keyword is permitted.
	final int j=9;
	
	// k=90; 			//cant change value of final variable.
	System.out.println("valaue of k= "+k);
	System.out.println("valaue of j= "+j);

}
}
