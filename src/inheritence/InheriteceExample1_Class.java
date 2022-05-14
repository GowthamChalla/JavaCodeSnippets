package inheritence;

/*Program to demonstrate 
 * B Class Inherited A Class and Object is created to B Class*/

class InheriteceExample1_Class {

	public static void main(String[] args) 
	{	

		B obj = new B();      
		//===========> Object is created to B Class and Assigned to B Class Reference Variable
		
        System.out.println("Class x Variable Value - " + obj.x); 
        //==> if Both Derived and Super class has same variable name, Super class will get overridden by base class.
        // ==> Here B Class X Value will get displayed.
		
        System.out.println("\nClass y Variable Value - " + obj.y);
	    //==> Here A Class Y value will get displayed because Derived class does not have Y.            
		
        System.out.println("\nCall Print Method");
		obj.print();
		//==> if Both Derived and Super class has same method name, Super class method will get overridden by Derived class.
        // ==> Here B Class Print method will be called.

		System.out.println("\nCall show method");
		obj.show();
        // ==> Here B Class Show method will be called. It is available only in B Class, No need to override.
 
		
		System.out.println("\nCall sample method");
		obj.sample();
		//==> Here A Class Sample method will be called. It is available only in A Class, No need to override.
		
	}
}
class A
{
	int x = 100;
	int y = 200;
	public void print()
	{
		System.out.println("A Class");
	}
	public void sample()
	{
		System.out.println("A Class");
	}
}
class B extends A
{	
	int x = 1000;
	public void print()
	{
		System.out.println("B Class");
	}
	public void show()
	{
		System.out.println("B Class");
	}
}
