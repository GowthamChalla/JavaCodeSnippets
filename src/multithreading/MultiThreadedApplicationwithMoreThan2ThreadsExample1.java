package multithreading;
import java.lang.Thread;

public class MultiThreadedApplicationwithMoreThan2ThreadsExample1 extends Thread
{
	public void run()
	{
		for (int i =1;i<=10;i++)
		{
			System.out.println(getName()+" - "+i);
		}
	}
	public static void main(String[] args) 
	{
		MultiThreadedApplicationwithMoreThan2ThreadsExample1 obj1 = new MultiThreadedApplicationwithMoreThan2ThreadsExample1();
		MultiThreadedApplicationwithMoreThan2ThreadsExample1 obj2 = new MultiThreadedApplicationwithMoreThan2ThreadsExample1();
      
		// Call Child Thread 1
		obj1.setName("Child Thread1");
		obj1.start();
		
		//Call Child Thread2
		obj2.setName("Child Thread2");
		obj2.start();
		
		//Main thread
		for (int i =1;i<=10;i++)
		{
			System.out.println("Main Thread - "+i);
		}
	}
}
