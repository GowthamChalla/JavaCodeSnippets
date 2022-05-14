package arraysAndstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_RepeatedDigitInNumber {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Number - ");
		String number = input.readLine();
		
		char[] charr = number.toCharArray();
		
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
			System.out.println(number+ " Has Unique Digits.");
		}
		else
		{
			System.out.println(number+ " Has Duplicate Digits.");
		}
		

	}

}
