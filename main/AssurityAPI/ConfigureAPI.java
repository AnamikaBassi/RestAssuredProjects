package AssurityAPI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Properties;

import com.google.common.io.Resources;

public class ConfigureAPI {


	public static Properties loadAPICredentials() {
		Properties configProperties = new Properties();

		try {

			URL path = Resources.getResource("environment.properties");
			File f = new File(path.getFile());
			BufferedReader reader = new BufferedReader(new FileReader(f));

			configProperties.load(reader);

		}
		catch(Exception e){
			System.out.println("Could not load the file");
			e.printStackTrace();
		}
		return configProperties;
	}

}
