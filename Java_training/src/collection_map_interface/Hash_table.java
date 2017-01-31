package collection_map_interface;
import java.util.*;
public class Hash_table 
{
//only unique.
	public static void main(String[] args) 
	{
	Hashtable<Integer, String>ht=new 	Hashtable<Integer, String>();
	ht.put(1, "Reshma");
	ht.put(2, "Ravi");
	ht.put(5, "Ani");
	ht.put(10,"Amu");
	ht.put(10,"Amu");
	ht.put(3, "Rahul");
	ht.put(4, "Ramu");
	
	for(Map.Entry m:ht.entrySet())
	{
		System.out.println(m.getKey()+"   "+m.getValue());
	}
	}

}
