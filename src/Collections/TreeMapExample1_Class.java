package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample1_Class 
{
	/*   TreeMap<k,v>  */
	
	/*
	    Below points are same as HashMap and LinkedHashMap
	 	1. It is a two dimensional collections class. it maintains key and value pairs.
	 	2. It does not allow duplicate keys, Value may be duplicated.
	 	3. Initial capacity of LinkedHashMap is 16 and load factor is 75%.
	 	
	 	Below points are different from HashMap and linkedHashMap
	 	1. It is an implementation of binary search tree technique with linked representation.
	 	2. It occupies more memory than Hashmap because data stored in nodes.
	 	3. It is an Sorted map and Insertion order is not preserved.
	 	4. It does not allow null keys but it allows null values.
	 	
	 */
	
	public static void main(String args[])
	{
		
		TreeMap<Integer,String> emp = new TreeMap<>();
		emp.put(101, "Employee1");
		emp.put(102, "Employee2");
		emp.put(103, "Employee3");	
		
		System.out.println("Draw back :: Println method cannot display elements one at a time.");
		System.out.println("********************Display all elements using Println method********************");
		displayAllElements(emp);
		
		
		System.out.println("\n\n\nAdvantage :: Using foreach loop with Lamda expression we can display each element one by one.");
		System.out.println("********************Display Elements using For Each Loop********************");
		displayAllElementsOnebyOneUsingForEach(emp);
		
		System.out.println("\n\n\nAdvantage :: Using pre existed Entryset method we can display each element one by one.");
		System.out.println("********************Display Elements using Entry Set********************");
		displayAllElementsUsingEntrySet(emp);
		
		System.out.println("\n\n\nAdvantage :: All keys in a MAP can be retrieved using keyset() method");
		System.out.println("********************Display All Keys in a MAP using keyset()********************");
		getAllKeysUsingKeySet(emp);
		
		System.out.println("\n\n\nAdvantage :: All Values in a MAP can be retrieved using Values() method");
		System.out.println("********************Display All Values in a MAP using Values()********************");
		getAllValuesUsingValue(emp);
		
		System.out.println("\n\n\nRemove :: One element from the MAP using Key");
		System.out.println("********************Display the value of removed Key********************");
		remove(emp);	
		
	}
	public static void displayAllElements(TreeMap<Integer,String> emp)
	{
		System.out.println(emp);
	}
	public static void displayAllElementsOnebyOneUsingForEach(TreeMap<Integer,String> emp)
	{
		emp.forEach((k,v) ->
		{System.out.println("Key - "+k+" Value - "+v); }
	       );
	}
	public static void displayAllElementsUsingEntrySet(TreeMap<Integer,String> emp)
	{
		for (Map.Entry<Integer, String> entry : emp.entrySet())
		{
			Integer K = entry.getKey();
			String V = entry.getValue();
			System.out.println("Key - "+K+" Value - "+V);
		}
	}
	public static void getAllKeysUsingKeySet(TreeMap<Integer,String> emp)
	{
		Set<Integer> hs = emp.keySet();
		for(int key : hs)
		{
			System.out.println(key);
		}
	}
	public static void getAllValuesUsingValue(TreeMap<Integer,String> emp)
	{
		Collection<String> allvalues = emp.values();
		for(String value : allvalues)
		{
			System.out.println(value);
		}
	}
	
	public static void remove(TreeMap<Integer,String> emp)
	{
		String result = emp.remove(103);
		System.out.println(result);
		
	}
}
