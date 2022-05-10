package Collections;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassExample1_Class {

	public static void main(String[] args) 
	{
	  ArrayList<Integer> arr = new ArrayList<>();
	  arr.add(10);
	  arr.add(50);
	  arr.add(30);
	  arr.add(60);
	  arr.add(40);
	  
	  System.out.println("Regular Array List ::");
	  System.out.println(arr);
	  
	  System.out.println("\n\nSorted List Using Collections Class.");
	  Collections.sort(arr);
	  System.out.println(arr);
	  
	  System.out.println("\n\nReversedList Using Collections Class.");
	  Collections.reverse(arr);
	  System.out.println(arr);
	  
	  System.out.println("\n\nAdd individual elements to the collection list.");
	  Collections.addAll(arr, 10,20);
	  System.out.println(arr);  
	
	}

}
