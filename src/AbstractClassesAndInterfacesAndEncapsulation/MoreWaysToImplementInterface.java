package AbstractClassesAndInterfacesAndEncapsulation;
@FunctionalInterface
interface Test1234
{
	public void print();
}
public class MoreWaysToImplementInterface 
{
	public static void main(String[] args) 
	{
		Test1234 t = new Test1234()
				{
			      public void print()
			      {
			    	  System.out.println("Print");
			      }
				};
				t.print();
	}
}
