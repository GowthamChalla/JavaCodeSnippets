package Collections;

import java.util.ArrayDeque;

public class ArrayDequeExample1_Class 
{
	/*   ArrayDeque<E> 	 */
	
	/*
	  	1. It is an implementation of double ended queue data structure with array representation.
	  	2. It allows both insertion and deletion at both ends (rear end and front end) because it implements deque interface.
	  	3. It allows duplicate elements. 
	  	4. It does not allow null values.
	  	5. Initial capacity of arraydeque is 16 and load factor is 100%.
	  	6. Insertion order is preserved.
	 */

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(50);
		ad.add(100);
		ad.add(200);
		ad.addFirst(30);
		ad.addLast(250);
		ad.addFirst(20);
		ad.addLast(20);	
		
		
		for (int a : ad)
		{
			System.out.println(a+" ");
		}
	}
}
