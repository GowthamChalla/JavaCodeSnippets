package miscellaneous;

public class VarargsExample 
{
	public static void main(String[] args) 
	{	  
      Demo d = new Demo();
      d.add();
      d.add(10);
      d.add(10,20);
      d.add(10,20,30);
	}
}
class Demo
{
	public void add(int... a)
	{
		System.out.println("Addtions");
	}	
}
