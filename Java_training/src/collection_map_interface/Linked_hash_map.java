package collection_map_interface;
import java.util.*;
public class Linked_hash_map
{

	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String> ();
		lhm.put(1, "piu");
		lhm.put(2, "Reshma");
		lhm.put(3, "Geeta");
		lhm.put(4, "Minu");
		
		
		for(Map.Entry h:lhm.entrySet())

		{
			System.out.println(h.getKey()+"   "+h.getValue());
		}
	}

}
