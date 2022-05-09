package Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadContentFromFiletoDisplayInConsole
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = null;
		try
		{	
			//Open the file for reading, if not exist FileNotFoundException
			fis = new FileInputStream("c:\\Java\\sample.txt");
			//Get the file size
			int n = fis.available();
			//Allocate memory in Ram
			byte[] b = new byte[n];
			//Read the file content
			fis.read(b);
			//Convert byte to String
			String str = new String(b);
			//Display content in the Console
			System.out.println(str);
			
		}
		catch (FileNotFoundException ex)
		{
			System.err.print(ex.getMessage());
		}
		finally
		{
			fis.close();
		}
	   

	}

}
