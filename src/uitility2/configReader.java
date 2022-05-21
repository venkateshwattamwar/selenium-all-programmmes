package uitility2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";//path define kel
		
		FileInputStream fis=new FileInputStream(path);//file read kate
		
		prop.load(fis);
		
		String value = prop.getProperty("Testurl");
		String value1=prop.getProperty("username");
		String value2=prop.getProperty("password");
		String value3=prop.getProperty("pin");
		
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
