package collection_list_interface;
import java.util.*;
class stud{
	int roll,marks;
	String name;
	stud(int roll,int marks,String name)
	{
		this.roll=roll;
		this.marks=marks;
		this.name=name;
	}
	
}
public class Array_list_User_defined
{
	public static void main(String[] args) 
	{
		stud s1=new stud(1,80,"Piu");
		stud s2=new stud(2,85,"Piydy");
		stud s3=new stud(3,90,"Prem");
		stud s4=new stud(4,87,"Om");
	  
		ArrayList <stud> a1= new ArrayList <stud>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		Iterator it = a1.iterator();
		while(it.hasNext())
		{
			stud st=(stud) it.next();
			System.out.println(" roll="+st.roll+"  "+" marks=  "+st.marks+"   "+"name ="+st.name);
		}
		
	}

}
