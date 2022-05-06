package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2_Class 
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
		ArrayList<Integer> al = new ArrayList<>();
		al.add(101);
		al.add(102);
		al.add(103);	

	    System.out.println("Display All Elements");
	    System.out.print(al);
	    
	    System.out.println("\n\nDisplay each Element one by one using for loop.");
	    for (int a : al)
	    {
	    	System.out.print(a+" ");
	    }
	}
}
