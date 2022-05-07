package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample1_Class 
{

	public static void main(String[] args) 
	{

		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(20);
		hs.add(null);
		hs.add(10);
		hs.add(5);
		hs.add(5);
		
		System.out.println("Display all elements together.");		
		System.out.println(hs);
		
		System.out.println("\n\nUsing for each to dispaly elements one by one.");		
		for(Integer i : hs)
		{
			System.out.print(i + " ");
		}
		
		System.out.println("\n\nUsing Iterator Interface to dispaly elements one by one.");		
		Iterator<Integer> si =  hs.iterator();
		while (si.hasNext())
		{
			System.out.print(si.next()+ " ");
		}
		
		System.out.println("\n\n1. Insertion Order is Preserved. "
				+ "\n2. null vlaues are allowed. "
				+ "\n3. Duplicate Values are Removed."
				+ "");
		
      

	}

}
