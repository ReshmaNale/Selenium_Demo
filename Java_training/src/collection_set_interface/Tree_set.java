package collection_set_interface;
import java.util.*;
public class Tree_set
{
	public static void main(String[] args) 
	{
	TreeSet <String>lh1=new TreeSet <String>();
		lh1.add("piu");
		lh1.add("Rahul");
		lh1.add("Prem");
		lh1.add("Retesh");
		lh1.add("Sonu");
		lh1.add("Prem");

		Iterator <String>it=lh1.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());	
		}

			}

	}


