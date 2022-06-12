package AbstractClassesAndInterfacesAndEncapsulation;

interface Test
{
	default public void show()
	{
		System.out.println("Show");
	}
	
}
public class DefaultMethodInInterface implements Test
{
	public static void main(String[] args) 
	{
		DefaultMethodInInterface obj = new DefaultMethodInInterface();
		obj.show();
		//or
		Test t = new DefaultMethodInInterface();
		t.show();
		
	}
}
