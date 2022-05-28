package multithreading;

public class MultiThreadingApplicationWithRunnableInterface implements Runnable
{
	public void run()
	{
		for (int i =1;i<=10;i++)
		{
			System.out.println("Child Thread - "+i);
		}
	}
	public static void main(String[] args) 
	{		
	 Runnable r = new MultiThreadingApplicationWithRunnableInterface();
	 Thread t = new Thread(r);
	 t.start();
	 
	 //Main Thread
	 for (int i =1;i<=10;i++)
		{
			System.out.println("Main Thread - "+i);
		}
	}
}
