package Collections;

import java.util.Arrays;

public class ArrayClassExample1_Class {

	public static void main(String[] args) 
	{
		int[] arr = new int[] {10,20,25,19,30,40,50};
		
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));		

	}
}
