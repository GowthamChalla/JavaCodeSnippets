package Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadContentFromFiletoWriteInOtherFile {

	public static void main(String[] args) throws IOException 
	{
	  FileInputStream fis = null;
	  FileOutputStream fos = null;
	  
	  try
	  {
		  //Open the File to Read, if not exist FileNotFoundException
		  fis = new FileInputStream("C:\\Java\\Sample.txt");
		  
		  //Get the Content Size
		  int n = fis.available();
		  
		  //Allocate memory in RAM
		  byte[] b = new byte[n];
		  
		  //Read the data
		  fis.read(b);
		  
		  //Open the File to Write, if not exist Create.
		  // This is write mode, existing data will get erased.
		  fos = new FileOutputStream("C:\\Java\\Sample1.txt");
		  fos.write(b);
	  }
	  catch (FileNotFoundException ex)
	  {
		  System.err.println(ex.getMessage());
	  }
	  catch (IOException ex)
	  {
		  System.err.println(ex.getMessage());
	  }
	  finally
	  {
		  fis.close();
		  fos.close();
	  }

	}

}
