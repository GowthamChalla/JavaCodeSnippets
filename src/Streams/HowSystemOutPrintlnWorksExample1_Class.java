package Streams;

public class HowSystemOutPrintlnWorksExample1_Class 
{
	public static void main(String[] args) 
	{
		B.a.display("Gowtham");
	}
}
class A
{
	void display(String str)
	{
		System.out.println(str);
	}
}
class B
{
	static A a = new A(); //This is reference to A and Static member of B Class.
}

