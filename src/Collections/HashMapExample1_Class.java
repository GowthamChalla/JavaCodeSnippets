package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample1_Class 
{
	/*   HashMap<k,v>  */
	
	/**Notes	
		1. It is a two dimensional collections class. it maintains key and value pairs.
		2. It does not allow duplicate keys, values can be duplicate.
		3. It allows one null key and many null values
		4. It is UnOrdered MAP, Insertion order is not preserved.
		5. Initial capacity of HashMap is 16 and load factor is 75%.
		6. It is an implementation of Hashing technique with array representation.	
    */
	public static void main(String[] args) 
	{		
		HashMap<Integer,String> emp = new HashMap<>();
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
	public static void displayAllElements(HashMap<Integer,String> emp)
	{
		System.out.println(emp);
	}
	public static void displayAllElementsOnebyOneUsingForEach(HashMap<Integer,String> emp)
	{
		emp.forEach((k,v) ->
		{System.out.println("Key - "+k+" Value - "+v); }
	       );
	}
	public static void displayAllElementsUsingEntrySet(HashMap<Integer,String> emp)
	{
		for (Map.Entry<Integer, String> entry : emp.entrySet())
		{
			Integer K = entry.getKey();
			String V = entry.getValue();
			System.out.println("Key - "+K+" Value - "+V);
		}
	}
	public static void getAllKeysUsingKeySet(HashMap<Integer,String> emp)
	{
		Set<Integer> hs = emp.keySet();
		for(int key : hs)
		{
			System.out.println(key);
		}
	}
	public static void getAllValuesUsingValue(HashMap<Integer,String> emp)
	{
		Collection<String> allvalues = emp.values();
		for(String value : allvalues)
		{
			System.out.println(value);
		}
	}
	
	public static void remove(HashMap<Integer,String> emp)
	{
		String result = emp.remove(103);
		System.out.println(result);
		
	}
	

}
