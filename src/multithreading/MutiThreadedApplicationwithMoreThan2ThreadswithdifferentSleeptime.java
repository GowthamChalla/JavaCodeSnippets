package multithreading;
import java.lang.Thread;

public class MutiThreadedApplicationwithMoreThan2ThreadswithdifferentSleeptime extends Thread
{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			try 
			{
				if (getName().equalsIgnoreCase("Child Thread1"))
				{		
					System.out.println("Child Thread1 - "+i);
						Thread.sleep(1000);				
				}
				else if (getName().equalsIgnoreCase("Child Thread2"))
				{		
					System.out.println("Child Thread2 - "+i);
						Thread.sleep(2000);			
				}
			}
			catch (InterruptedException e) 
			{					
				e.getMessage();
			}
		}
	}
	public static void main(String[] args) 
	{
		MutiThreadedApplicationwithMoreThan2ThreadswithdifferentSleeptime obj1 = new MutiThreadedApplicationwithMoreThan2ThreadswithdifferentSleeptime();
		MutiThreadedApplicationwithMoreThan2ThreadswithdifferentSleeptime obj2 = new MutiThreadedApplicationwithMoreThan2ThreadswithdifferentSleeptime();
		
		//Call ChildThread1
		obj1.setName("Child Thread1");
		obj1.start();
		
		//Call ChildThread2
		obj2.setName("Child Thread2");
		obj2.start();
		
		//Main thread
		try
		{
			for (int i=1;i<=10;i++)
			{
				System.out.println("Main Thread - "+i);
				Thread.sleep(3000);	
			}		
		}
		catch (InterruptedException ex)
		{
			ex.getMessage();
		}
	}
}
