package arraysAndstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertStringToOtherDataTypes {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter the String");
		String str = br.readLine();
		
		//String Convert to Character
		for (char c : str.toCharArray())
		{
			System.out.print(c + " ");
		}
		
		//String Converted to Integer
		int i = Integer.parseInt(str);
		System.out.print(i + " ");
		
		//String Convert to Float
		float j = Float.parseFloat(str);
		System.out.print(j + " ");
	}

}
