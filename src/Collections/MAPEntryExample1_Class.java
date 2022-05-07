package Collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class MAPEntryExample1_Class {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(101, "Employee1");
		tm.put(102, "Employee2");
		tm.put(103, "Employee3");
		
		System.out.println("Retrieve the Elements using MAP.EntrySet()");
		for(Entry<Integer,String> e : tm.entrySet())
		{
			System.out.print ("Key - "+e.getKey()+" Value - "+e.getValue()+ " ");
		}
		
		System.out.println("\n\nRetrieve the Elements using lamda expression");
		tm.forEach((k,v) -> 
		         {
		        	 System.out.println("Key - "+k+" Value - "+v);
		          });

	}

}
