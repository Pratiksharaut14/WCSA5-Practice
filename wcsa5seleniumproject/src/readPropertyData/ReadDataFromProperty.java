package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		
//		Read data from property file

		FileInputStream fis = new FileInputStream("./data/config.properties"); 
		
//		Create object of Properties class(Java)
		
		Properties prop = new Properties();
		
//		Make a file ready to read
		prop.load(fis);
		
//		Read particular property from file
		String browser = prop.getProperty("Browser"); //If wrong value provided default value will get printed
		
		System.out.println(browser);
		
//		String url = prop.getProperty("Url");
//		
//		System.out.println(url);
//		
//		String usn = prop.getProperty("Username");
//		
//		System.out.println(usn);
//		
//		String pwd = prop.getProperty("Password");
//		
//		System.out.println(pwd);
//		
	}

}
