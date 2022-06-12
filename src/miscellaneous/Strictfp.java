package miscellaneous;

/*
 1. strictfp ensures to give same results in all platforms while performing operations on floating point numbers
 2. it is modifier and it can be used with either class, interface or methods only.
 3. if class of interface prefixed with strictfp keyword then all methods of class and interface are implicitly strictfp methods only.
 */
strictfp public class Strictfp 
{
	public static void main(String[] args) 
	{
	  float a = 10.0f;
	  float b = 3.0f;
	  System.out.println(a/b);
	}
}
