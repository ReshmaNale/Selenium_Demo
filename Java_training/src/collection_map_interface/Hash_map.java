package collection_map_interface;
import java.util.*;

public class Hash_map
{
	public static void main(String[] args)
	{
HashMap <Integer,String> hm=new HashMap <Integer,String>();

hm.put(1, "Reshma");
hm.put(2, "Ravi");

hm.put(5, "Ani");
hm.put(10,"Amu");
hm.put(3, "Rahul");
hm.put(4, "Ramu");
for(Map.Entry m:hm.entrySet())
{
	System.out.println(m.getKey()+"   "+m.getValue());
}
	}

}
