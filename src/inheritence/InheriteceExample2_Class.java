package inheritence;

/*Program to demonstrate 
 * C Class Inherited to D Class and Object is created to D Class (Derived class) 
 * and assigned to C class (Base class) reference variable.*/

class InheriteceExample2_Class {

	public static void main(String[] args) 
	{	

		 C obj = new D();      
		//===========> Object is created to D Class (Derived Class) and Assigned to B Class (Superclass) Reference Variable
		
        System.out.println("Class x Variable Value - " + obj.x); 
        //==> if Both Derived and Super class has same variable name, Only super class variable will get display. Variable will not be overridden.       
        // ==> Here C Class X Value will get displayed.
		
        System.out.println("\nClass y Variable Value - " + obj.y);
	    //==> Here C Class Y value will get displayed because derived class does not have Y.            
		
        System.out.println("\nCall Print Method");
		obj.print();
		//==> if Both Derived and Super class has same method name, Super class will get overridden by base class.
        // ==> Here D Class Print method will be called.

		System.out.println("\nCall show method");
		//obj.show();
        // ==> Here D Class Show method is not accessible.
 
		
		System.out.println("\nCall sample method");
		obj.sample();
		//==> Here C Class Sample method will be called.
		
	}
}
class C
{
	int x = 100;
	int y = 200;
	public void print()
	{
		System.out.println("C Class");
	}
	public void sample()
	{
		System.out.println("C Class");
	}
}
class D extends C
{	
	int x = 1000;
	public void print()
	{
		System.out.println("D Class");
	}
	public void show()
	{
		System.out.println("D Class");
	}
}
