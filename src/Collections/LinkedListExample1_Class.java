package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample1_Class 
{
    /* Summary */
	/*
		It is a linked representation of List implementation class.
		It allows duplicate elements because it implements List interface.
		It allows null values also.
		It occupies more memory because data is stored in nodes.
    */
	public static void main(String[] args) 
	{
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(1,5);
		ll.add(4,40);
		
		System.out.println("Display All Elements all at once.");
		System.out.println(ll);
		
		   System.out.println("\n\nDisplay All Elements in LinkedList one by one using for loop.");
		   for(int i : ll)
		   {
		     System.out.print(i+" ");
		   }
	   
		 System.out.println("\n\nDisplay All Elements in LinkedList one by one using Iterator interface");
		 Iterator<Integer> i = ll.iterator();
		 while (i.hasNext())
		 {
			 System.out.print(i.next()+ " ");
		 }
		 
		 System.out.println("\n\nDisplay All Elements in LinkedList one by one using ListIterator interface");
		 ListIterator<Integer> li = ll.listIterator();
		  while (li.hasNext())
		 {			 
			 System.out.print(li.next()+ " ");			 
		 }		
	   
	}

}
