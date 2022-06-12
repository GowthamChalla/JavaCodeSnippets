package arraysAndstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class  AnogramExampleWithDataStructure
{
	public static void main(String args[]) throws IOException
	{
		String str = "Hello".toLowerCase();
		String str1 = "hoell".toLowerCase();
		
		char[] ch = str.toCharArray();	
		char[] ch1 = str1.toCharArray();
		String s1 = new String (arrSort(ch));
		String s2 = new String (arrSort(ch1));
		if (s1.equals(s2))
		{
			System.out.println("Anogram");
		}
		else
		{
			System.out.println("Not an Anogram");
		}
	}
	public static char[] arrSort(char[] ch)
	{
       char temp ;
		
		for (int j = 0;j<ch.length;j++)
		{
			int k = 0;
			boolean check = false;
			temp = ch[j];
			for (int i = j;i<ch.length-1;i++)
			{			
				if ((int)temp > (int)ch[i+1])
				{
					temp = ch[i+1];
					k = i+1;
					check = true;
				}
			}
			if (check)
			{
				ch[k] = ch[j];
				ch[j] = temp;	
			}
		}		
		return ch;		
	}
}
