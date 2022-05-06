package Collections;

import java.util.PriorityQueue;


public class PriorityQueueExample1_Class 
{
	/*   PriorityQueue<E> */
	
	/*
		1. Elements inserted at rear end and deleted at front end.
		2. Does not allow null values.
		3. Allows duplicate values.
		4. Least element is given highest priority. Priorities are compared using java.util.comparator interface.
		5. Initial capacity is 11 and load factor is 100%.
		6. It uses Heap tree data structure, Heap tree is a tree in which each node is greater than its child nodes.
		7. offer() is used to insert elements.
		8. poll() is used to remove the elements.
		9. Insertion order is not preserved.		
	 
	 */

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(100); //or pq.offer(;)
		pq.offer(78);
		pq.add(81);
		pq.offer(56);
		pq.add(99);
		
		System.out.println("Draw back :: Println method cannot display elements one at a time.");
		System.out.println("Point1 :: PriorityQueue will not maintain Insertion Order.");
		System.out.println("Point2 :: PriorityQueue will give higher priority to least element.");
		System.out.println("Point3 :: Least element will be the first element.");
		System.out.println("********************Display all elements using Println method********************");
		displayAllElements(pq);
		
		System.out.println("\n\n\nRemove :: PriorityQueue will Removes the least element is the queue");
		System.out.println("Point1 :: After Remove the first element, next least element will become the first element");
		remove(pq);
		
		System.out.println("\n\n\n********************Display Elements using For Loop********************");
		displayAllElementsOnebyOneUsingForLoop(pq);

	}
	public static void displayAllElements(PriorityQueue<Integer> pq)
	{
		System.out.println(pq);
	}
	public static void remove(PriorityQueue<Integer> pq)
	{
		Integer result = pq.remove(); //or pq.poll();
		System.out.println(result);		
		
	}
	public static void displayAllElementsOnebyOneUsingForLoop(PriorityQueue<Integer> pq)
	{
		for(int a:pq)
		{
			System.out.println(a);
		}
	}
}
