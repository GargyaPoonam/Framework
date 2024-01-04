package ConfigDataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigData {
	Properties prop;
	
	public ConfigData() {
		File src = new File("/Users/poonamsharma/eclipse-workspace/Flipkart/ConfigData/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
				prop.load(fis);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("not able to load the file"+e.getMessage());
			}
			
			
		}
	public String getDatefromconfig(String KeyToSearch) {
		return prop.getProperty("KeyToSearch");
	}
	public String getBrowser() {
		return prop.getProperty("browserName");
		
	}
	
	public String getUrl() {
		return prop.getProperty("url");
		
	}
	}


