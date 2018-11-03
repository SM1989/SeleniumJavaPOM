package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readandwrite {

	public static void main(String[] args) throws IOException {
		String x = getproperties();
		System.out.println(x);		
	}
	
	public static String getproperties() {
		
		try {
			Properties prop = new Properties();
			String path = System.getProperty("user.dir");
			InputStream input = new FileInputStream(path + "/src/test/java/config/config.properties");
			try {
				prop.load(input);
			} catch (IOException e) {				
				e.printStackTrace();
			}
			String browsername = prop.getProperty("browser");
			System.out.println(browsername);
			return browsername;
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return null;
	}
}
