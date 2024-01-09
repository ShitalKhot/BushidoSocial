package BushSoc.config;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFile {
	
	public static Properties prop = new Properties();
	
	public static void readproperties() {
		
		try {
			FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/BushSoc/config/config.properties");
			prop.load(input);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static String devurl() {
		String developmenturl="";
		try {
			String filePath=System.getProperty("user.dir")+"/src/test/java/BushSoc/config/dev.properties";

			FileInputStream file = new FileInputStream(filePath);
			prop.load(file);
			prop.getProperty("dev");
			developmenturl=prop.getProperty("dev");
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return developmenturl;
	}
	
	public static String liveurl() {
	    String productionurl = "";
	    try {
	        String filePath = System.getProperty("user.dir") + "/src/test/java/BushSoc/config/live.properties";

	        FileInputStream file = new FileInputStream(filePath);
	        prop.load(file);
	        prop.getProperty("live" + "");
	        productionurl = prop.getProperty("live");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return productionurl;
	}
}