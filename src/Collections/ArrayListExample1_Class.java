package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1_Class
{
/*   ArrayList<E>  */
	
	/*
	 	1. It is a resizable array of list implementation class.
	 	2. It allows one null value.
	 	3. It allows duplicate values.
	 	4. Insertion order is not preserved.
	 	5. It supports both homogeneous and heterogeneous elements.
	 	6. Size of the ArrayList is not limited.
	 	
	 */
	public static void main(String args[])
	{

		ArrayList al = new ArrayList<>();
		al.add(101);
		al.add("Gowtham");
		al.add(10000.00f);	

	    System.out.println("Display All Elements");
	    System.out.print(al);
	    
	    System.out.println("\n\nDisplay each Element one by one using Iterator interface.");
	    Iterator x = al.iterator();
	    while(x.hasNext())
	    {
	    	System.out.println(x.next());
	    }
	
		
	}

}
