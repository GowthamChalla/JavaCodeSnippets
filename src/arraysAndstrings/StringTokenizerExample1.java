package arraysAndstrings;

import java.util.StringTokenizer;

public class StringTokenizerExample1 
{
	public static void main(String[] args) 
	{
		StringTokenizer str = new StringTokenizer("Gowtham Challa Lives in Atlanta.");
		while (str.hasMoreTokens())
				{
			      System.out.println(str.nextToken());
				}
	}
}
