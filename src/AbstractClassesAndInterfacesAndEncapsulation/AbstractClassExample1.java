package AbstractClassesAndInterfacesAndEncapsulation;

public class AbstractClassExample1 {

	public static void main(String[] args) 
	{	
        A obj = new B();
        obj.print();
        obj.show();
        
        B obj1 = new B();
        obj1.print();
        obj1.show();        
	}
}
abstract class A
{
	public abstract void print();
	
	public void show()
	{		
		System.out.println("A Class - Show method");
	}
}
class B extends A
{
	@Override
	public void show()
	{		
		System.out.println("B Class - Show method");
	}
	
	public void print()
	{
		System.out.println("Print Method");
	}
}

