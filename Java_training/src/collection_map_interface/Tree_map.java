package collection_map_interface;
import java.util.*;
public class Tree_map 
{
	public static void main(String[] args) 
	{
	TreeMap<Integer,String> lhm=new TreeMap<Integer,String> ();
		lhm.put(1, "piu");
		lhm.put(5, "Ani");
		lhm.put(10,"Amu");
		lhm.put(2, "Reshma");
		lhm.put(3, "Geeta");
		lhm.put(4, "Minu");
		
		for(Map.Entry h:lhm.entrySet())
		{
			System.out.println(h.getKey()+"   "+h.getValue());
		}
		
	}

}
