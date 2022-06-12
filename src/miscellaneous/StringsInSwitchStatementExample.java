package miscellaneous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringsInSwitchStatementExample {

	public static void main(String[] args) throws IOException 
	{
		Scanner s = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter - ");
		String str = s.next();
	    switch (str)
	    {
	    case "Gowtham":
	    {
	    	System.out.println("Father.");
	    	break;
	    }
	    case "Anusha":
	    {
	    	System.out.println("Mother.");
	    	break;
	    }
	    case "Siddhu":
	    {
	    	System.out.println("SON.");
	    	break;
	    }
	    default:
	    	System.out.println("Others.");
	    }
	}
}
