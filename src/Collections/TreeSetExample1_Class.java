package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample1_Class {

	public static void main(String[] args) {

		TreeSet<Integer> hs = new TreeSet<>();
		hs.add(20);
		//hs.add(null);
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
		
		System.out.println("\n\n1. Insertion Order is not Preserved. "
				+ "\n2. null vlaues are not allowed. Java Null Pointer exception."
				+ "\n3. Duplicate Values are Removed."
				+ "\n4. Elements are sorted");
		
      

	}

}
