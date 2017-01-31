package final_use;

public class Blnk_final_variable
{
	//blank final variable initilized only in constructor.
	
	final int  PAN_CARD_NUMBER;  
	 Blnk_final_variable()
	 {
		 PAN_CARD_NUMBER=781744;
		 System.out.println(" value of PAN_CARD = "+PAN_CARD_NUMBER);
	 }
	 
//	final int pan_no;	//not initilized.

	public static void main(String[] args) 
	{
		Blnk_final_variable OBJ=new Blnk_final_variable();
		//OBJ.PAN_CARD_NUMBER
	}

}
class Student{  
int id;  
String name;  

}  