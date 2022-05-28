package multithreading;
import java.lang.Thread;

public class MuttiThreadApplicationExample1 extends Thread
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
	  MuttiThreadApplicationExample1 obj = new MuttiThreadApplicationExample1();	  
	  obj.start();	  
	  
	  /* Main Thread Code*/
	  for (int i =1;i<=10;i++)
		{
		  System.out.println("Main Thread - "+i);
		}
	}
}
