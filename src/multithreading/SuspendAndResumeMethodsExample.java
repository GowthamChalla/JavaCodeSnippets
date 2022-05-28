package multithreading;
import java.lang.Thread;

public class SuspendAndResumeMethodsExample extends Thread
{
	@SuppressWarnings("deprecation")
	public void run()
	{
		try
		{
			for (int i=1;i<=10;i++)
			{			
				System.out.println("Child Thread - "+i);
				Thread.sleep(1000);
				if (i == 5)
				{
				  suspend();
				}
				if (i==9)
				{
				 resume();
				}	
			}
		}
		catch(InterruptedException ex)
		{
			ex.getMessage();
		}
	}	
	public static void main(String[] args) throws InterruptedException 
	{	
		SuspendAndResumeMethodsExample obj = new SuspendAndResumeMethodsExample();
		obj.start();
		
		//Main thread
		for (int i=1;i<=10;i++)
		{
				
					System.out.println("Main Thread - "+i);
					 Thread.sleep(1000);				
			
		}
	}
}
