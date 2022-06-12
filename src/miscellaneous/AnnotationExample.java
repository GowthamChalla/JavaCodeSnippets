package miscellaneous;

public class AnnotationExample extends xyz
{
	public static void main(String[] args) 
	{
		AnnotationExample obj = new AnnotationExample();
		obj.show();
 
	}
	@Override
	void show()
	{
		System.out.println("Show method in main class");
	}
}
class xyz
{
	void show()
	{
		System.out.println("Show method in demo class");
	}
}
