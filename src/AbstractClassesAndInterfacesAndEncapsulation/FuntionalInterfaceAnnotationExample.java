package AbstractClassesAndInterfacesAndEncapsulation;

@FunctionalInterface
interface Test123
{
	void display();           //=> public abstract method, only one is allowed.
	default public void print()
	{
		System.out.println("Print");
	}	
}
@FunctionalInterface
interface show extends Test123
{
	default void show1()      
	{
		System.out.println("show1");
	}
	
	//Still Functional Interface because only one public abstract method.
}
public class FuntionalInterfaceAnnotationExample implements show
{
	public static void main(String[] args) 
	{	
		FuntionalInterfaceAnnotationExample obj = new FuntionalInterfaceAnnotationExample();
		
		obj.print();
		obj.show1();	
		obj.display();
	}
	public void display()
	{
		System.out.println("display");
	}   
}
