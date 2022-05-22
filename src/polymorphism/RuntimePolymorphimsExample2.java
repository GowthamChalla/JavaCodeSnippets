package polymorphism;
public class RuntimePolymorphimsExample2 
{
	public static void main(String[] args) 
	{
		parent p = new parent();
		p.show();
		
		child c = new child();
		c.show();
		
		parent p1 = new child();
		p1.show();            //  ==========> this is runtime polymorphism
	}
}
class parent
{
	public void show()
	{
		System.out.println("\nParent class");
	}
}
class child extends parent
{
	@Override
	public void show()
	{
		System.out.println("\nChild class");
	}
}
