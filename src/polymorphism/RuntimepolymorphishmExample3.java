package polymorphism;
public class RuntimepolymorphishmExample3 
{
	public static void main(String[] args) 
	{
		Human superObject=new Human();
		Human subObject=new Man();  // // upcasting : first level of heritance
		Human babyObject=new Baby();  // // upcasting : second level of heritance
		superObject.sip();
		subObject.sip();  //run time polymorphism happening in first level of heritance
		babyObject.sip(); //run time polymorphism happening in second level of heritance  
	}
}
class Human
{
	void sip() 
	{
	 System.out.println("Human is sipping");
	}
}
class Man extends Human
{
	void sip()
	{
		System.out.println("Man is sipping soup");
	}
}
class Baby extends Man
{
	void sip()
	{
		System.out.println("Baby is sipping milk");
	}
}
