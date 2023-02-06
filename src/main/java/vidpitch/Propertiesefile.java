package vidpitch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiesefile {
	
	
	 Properties properties;
	 String path = "C:\\Users\\47Billion\\eclipse-workspace\\Vipitch\\src\\main\\java\\vidpitch\\config.properties";

	public Propertiesefile() throws IOException {
		
		
		properties = new Properties();
		
		
		
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(path);
			properties.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	
	public String geturl() {
		
		String url = properties.getProperty("URL");
		
		return url;
		
		
	}
	
	
	
public String getemailchrome() {
		
String email = properties.getProperty("Emailchrome");
		
		return email;
		
		
		
	}


public String getemailmozila() {
	
String email = properties.getProperty("Emailmozila");
		
		return email;
		
	
		
	}


public String geturlmailinator() {
	
	String url = properties.getProperty("Mailinator");
	
	return url;
	
	
}



}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


