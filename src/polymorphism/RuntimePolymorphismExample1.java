package polymorphism;
public class RuntimePolymorphismExample1 
{
	public static void main(String[] args) 
	{		
		B obj = new B();
		int x = obj.add(10, 20);
		System.out.println(x);
		
		obj.show();
	}
}
class A
{	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public void show()
	{
		System.out.println("Class A");
	}	
}
class B extends A
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public void show()
	{
		System.out.println("Class B");
	}
}
