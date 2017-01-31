package collection_list_interface;
import java.util.*;
public class Array_list 
{
		public static void main(String[] args) 
	{
ArrayList <String>a1=new ArrayList<String>();
a1.add("Piu");
a1.add("Rahul");
a1.add("Prem");
a1.add("Retesh");
a1.add(4, "Piydya");
a1.add("Sonu");
	Iterator <String>it=a1.iterator();
	
while(it.hasNext())
{
	System.out.println(it.next());
}

	}

}
