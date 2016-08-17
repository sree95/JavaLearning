package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class ReadingProperties {

	@Test
	public void ReadProp() throws IOException {
		
		Properties properties = new Properties();
		
		InputStream is = new FileInputStream("G:\\Training\\TraningGit\\JavaLearning\\SeleniumTraining\\src\\OR.properties");
		
		properties.load(is);
		
		System.out.println(properties.getProperty("butxpath"));
	}
	
}
