package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NegativeNumberException1 extends RuntimeException
{
	
}
class cube1
{
	public int print(int x) throws NegativeNumberException1
	{
		if (x > 0)
			return x*x*x;
		else
		throw new NegativeNumberException1();
	}
}
public class UserDefinedExceptionExample2 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		 int x = Integer.parseInt(br.readLine());
		 int y = new cube1().print(x);
		 System.out.println(y);		
	}
}
