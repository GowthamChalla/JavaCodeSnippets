package Streams;

import java.io.IOException;

public class ReadInputFromConsoleAndWriteInConsoleExample1_Class {

	public static void main(String[] args) throws IOException 
	{
		byte[] b = new byte[10];
		System.out.println("Enter the Number ::");
		
		int n = System.in.read(b);
		
		//Convert integer to string
		String str = new String(b);
		
		//Trim the String
		String str1 = str.trim();
		
		System.out.println(str1);	

	}

}
