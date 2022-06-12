package polymorphism;

public class staticprivatefinalExample {

	public static void main(String[] args) {
		def parent = new ghi();
		parent.show();
		parent.print();
		parent.sample();

	}

}
class def
{
	public static void show()
	{
		System.out.println("def - Static method - Parent");
	}
	private void display()
	{
		System.out.println("def - private method - Parent");
	}
	
	final public void print()
	{
		System.out.println("def - final method - parent");
	}
	public void sample()
	{
		System.out.println("def - Instance method - parent");
	}
}
class ghi extends def
{
	@Override
	public static void show()
	{
		System.out.println("def - Static method - Child");
	}
	@Override
	private void display()
	{
		System.out.println("def - private method - Child");
	}
	
	/*
		final public void print()
		{
			System.out.println("def - final method - Child");
		}
	*/
	@Override
	public void sample()
	{
		System.out.println("def - Instance method - Child");
	}
}
