package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterfaceExample1_Class 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		
		System.out.println("Elements of a collection can be iterated using Iterator interface.");
		Iterator<Integer> i = al.iterator();
		
		while (i.hasNext())
		{
			int x = i.next();
			System.out.println(x);			
		}
		
		System.out.println("\n\nElements of a collection can also be iterated using enhanced for loop.");
	    for (int a:al)
	    {
	    	System.out.println(a);
	    }
		
	}
}
