package WrapperClasses;

public class WrapperClassExample1_Class {

	public static void main(String[] args) 
	{
        System.out.println("Convert int value to Integer.");       
        int x = 10;
        Integer a = new Integer(x);
        System.out.print(a);
        
        System.out.println("\n\nConvert Integer to int");
        Integer c = new Integer(20);
        int b = c.intValue();
        System.out.print(b);    
        
        
        System.out.println("\n\nAutoBoxing -> Converting premitive type to the corresponding reference type.");
        int n = 100;
        Integer m = n;
        System.out.print(m);
        
        System.out.println("\n\nAuto UN-Boxing -> Converting reference type to the corresponding premitive type.");
     Integer x1 = 200;
     int y = x1;
     System.out.print(x1);      


	}

}
