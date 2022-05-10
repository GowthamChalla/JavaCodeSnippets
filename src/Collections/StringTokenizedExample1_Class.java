package Collections;

import java.util.StringTokenizer;

public class StringTokenizedExample1_Class 
{

	public static void main(String[] args) 
	{
		String str = "Gowtham is living in Atlanta";
        StringTokenizer s = new StringTokenizer(str);
       
        while ((boolean) s.hasMoreTokens())
        {
        	System.out.println(s.nextToken());
        }
	}
}
