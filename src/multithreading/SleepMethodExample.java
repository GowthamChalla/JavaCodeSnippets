package multithreading;
import java.lang.Thread;

public class SleepMethodExample extends Thread
{
	public static void main(String[] args) throws InterruptedException 
	{		
		for (int i =1; i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(1000l);
		}
	}
}