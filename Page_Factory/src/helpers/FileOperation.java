package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileOperation 
{
	
   public String readPropertyFile(String key) throws Exception
   {
	   
	   // how to read a file
	   File file = new File(".\\src\\config.properties");
	   FileInputStream fs = new FileInputStream(file);
	   
	   Properties prop = new Properties();
	   prop.load(fs);
	   String value = prop.getProperty(key);
	   return value;
   }
}
