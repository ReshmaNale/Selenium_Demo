package collection_list_interface;
import java.util.*;
public class Linked_list 
{
	public static void main(String[] args) 
	{
LinkedList <String>L1=new LinkedList <String>();
L1.add("Ani");
L1.add("Ani");
L1.add("Ritu");
L1.add("Piu");
Iterator <String> it=L1.iterator();

while(it.hasNext())
{
	System.out.println("  "+it.next());
}
	}

}
