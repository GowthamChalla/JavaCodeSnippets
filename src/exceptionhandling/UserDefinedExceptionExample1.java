package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class NegativeNumberException extends Exception
{
	
}
class cube
{
	public int print(int x) throws NegativeNumberException
	{
		if (x > 0)
			return x*x*x;
		else
		throw new NegativeNumberException();
	}
}

public class UserDefinedExceptionExample1 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{			
		 int x = Integer.parseInt(br.readLine());
		 int y = new cube().print(x);
		 System.out.println(y);
		}
		catch (NegativeNumberException ex)
		{
			System.out.println(ex);
		}
	}
}
