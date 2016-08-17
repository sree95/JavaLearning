package WindowHandle;

import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukariWindows {

static WebDriver driver = null;
	
	@BeforeClass
	public  static void Opening() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
	}
	@Test
	public void CloseingSubWindow() throws InterruptedException {
		String currentWindow = driver.getWindowHandle();
		
		Set<String> winHandle =  driver.getWindowHandles();						
		
		System.out.println("Current Window" + currentWindow);
		
		
		for (String string : winHandle) {
			if (!string.equals(currentWindow)) {
				driver.switchTo().window(string);
				driver.close();
			}			
			driver.switchTo().window(currentWindow);			
		}		
	}
	
	@AfterClass
	public static void Closing() {
		driver.close();
	}
}
