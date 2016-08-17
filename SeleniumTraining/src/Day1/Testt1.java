package Day1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testt1 implements ISum {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "F:\\Training\\SeleniumSupport\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "F:\\Training\\SeleniumSupport\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

		
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
		
		
		
	}


	public void Add(int a, int b) {
		System.out.println("print");				
	}
		
	
	

}
