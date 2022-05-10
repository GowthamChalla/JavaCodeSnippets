package Collections;

import java.util.Random;

public class RandomExample1_Class {

	public static void main(String[] args) 
	{
	  Random r = new Random();
	  int x = r.nextInt(1000);
	  System.out.println(x);
	  
	  float y = r.nextFloat();
	  System.out.println(y);
	  
      boolean z = r.nextBoolean();
      System.out.println(z);
	  
	}

}
