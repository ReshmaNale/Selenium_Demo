package collection_Queue_inteface;
import java.util.*;
public class Priority_queue
{
	public static void main(String[] args)
	{
		PriorityQueue <String> pq=new PriorityQueue <String>();
		
		pq.add("piu");
		pq.add("Rahul");
		pq.add("Ani");
		pq.add("Ramu");
	pq.add("Ani");
		Iterator it=pq.iterator();

		System.out.println(pq.element());
		//The peek() method is used to retrieve the head of this queue.But it does not remove it.
		System.out.println("Head of the Queue = "+pq.peek());
		System.out.println("    ");
		System.out.println("Iterating queue elements....");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		//The remove(Object o) method is used to remove a single instance of the specified element from this queue, if it is present.
		pq.remove("Ramu");
		System.out.println("After removing Ramu element....");
		System.out.println("    ");
		//The poll() method is used to retrieve and remove the head of this queue, 
		//or returns null if this queue is empty
Iterator itr2=pq.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		pq.poll();
		System.out.println("After retriving and removing HEAD element ....");
		Iterator itr=pq.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
