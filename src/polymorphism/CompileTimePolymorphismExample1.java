package polymorphism;
public class CompileTimePolymorphismExample1
{
	public static void main(String[] args)
	{	
		Demo d = new Demo();
		int x = d.add(10, 20);
		float y = d.add(10.0f, 20);
		float z = d.add(10, 20.12f);
		
		System.out.println(x+ " - "+y+" - "+z);				
	}
}
class Demo
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public float add(float a,int b)
	{
		return a+b;
	}
	public float add(int a,float b)
	{
		return a+b;
	}
}


