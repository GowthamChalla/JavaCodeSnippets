package Collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample1_Class {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("emp.properties");
		Properties p = new Properties();
		p.load(fis);
		String name = p.getProperty("101");
		System.out.println(name);
	}

}
