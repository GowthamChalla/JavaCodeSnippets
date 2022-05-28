package multithreading;
import java.lang.Thread;

public class MainThreadExample extends Thread
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
		t.setName("Main Thread");
		t.setPriority(10);
		
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getState());	
	}
}
