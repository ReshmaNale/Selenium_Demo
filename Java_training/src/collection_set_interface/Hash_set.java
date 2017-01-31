package collection_set_interface;
import java.util.*;
public class Hash_set
{
	//Ignore duplicate.
	public static void main(String[] args) 
	{
	HashSet <String>h1=new HashSet <String>();
	
	h1.add("piu");
	h1.add("Rahul");
	h1.add("Ani");
	h1.add("Ramu");
	h1.add("Ani");

	Iterator <String>itr=h1.iterator();
	
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}

}
