package arraysAndstrings;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class String_UniqueCharactersInString {

	/* Implement an algorithm to find if string has all unique characters*/
	public static void main(String[] args) throws IOException 
	{
		BufferedReader standardInput
	    = new BufferedReader(new InputStreamReader(System.in));
	 
	System.out.print("Enter String: ");
	String name = standardInput.readLine();
	
	char[] charr = name.toCharArray();
	
	boolean isUnique = true;
	for (int j=0;j<charr.length;j++)
	{
		for (int i=j;i<charr.length-1;i++)
		{
			if (charr[i] == charr[i+1])
			{
				isUnique = false;				
			}
			
		}
		
	}
	if (isUnique)
	{
		System.out.println(name+ " Has Unique Characters.");
	}
	else
	{
		System.out.println(name+ " Has Duplicate Characters.");
	}
  }
	
}
