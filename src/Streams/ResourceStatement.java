package Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ResourceStatement {

	public static void main(String[] args) 
	{
	  try (FileInputStream fis = new FileInputStream("c:\\java\\sample.txt"))
			  {
		       int n =  fis.available();
		        
		      byte[] b = new byte[n];
		      
		      fis.read(b);
		      String str = new String(b);
		      System.out.println(str);
		      
			  }
	  catch (FileNotFoundException ex)
	  {
		  System.err.println(ex.getMessage());
	  }
	  catch (IOException ex)
	  {
		  System.err.println(ex.getMessage());
	  }

	}

}
