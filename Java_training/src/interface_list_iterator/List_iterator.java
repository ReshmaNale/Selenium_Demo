package interface_list_iterator;

import java.util.ArrayList;
import java.util.*;

public class List_iterator 
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
		
		ListIterator <String>it=a1.listIterator();
		System.out.println("Get element at 2nd position= "+a1.get(2));
		System.out.println("traversing elements in forward direction...");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
		ArrayList <String>a11=new ArrayList<String>();
		a11.add("Rahul");
		a11.add("Prem");
		a11.add("Sonu");
		a11.add("Piu");
		a11.add(4, "Piydya");
		a11.add("Retesh");
		System.out.println("traversing elements in Backward direction...");
		
		ListIterator <String>itr=a11.listIterator();	
		
		while(itr.hasPrevious())
		{
		System.out.println(itr.previous());
		 }
	}

}
