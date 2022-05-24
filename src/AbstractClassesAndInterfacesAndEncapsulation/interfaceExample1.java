package AbstractClassesAndInterfacesAndEncapsulation;

public class interfaceExample1 
{
	public static void main(String[] args) 
	{
      xyz obj = new xyz();
    		  {
    	         obj.show();
    	         obj.print();
    		  }
	}
}
interface abc
{
	int i = 10;
	public void show();
	public void print();
}
class xyz implements abc
{
	public void show()
	{
		System.out.println(abc.i);
	}
	
	public void print()
	{
		System.out.println(abc.i);
	}
}
