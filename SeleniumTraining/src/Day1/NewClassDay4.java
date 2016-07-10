package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NewClassDay4 {

	public static void main(String[] args) throws InterruptedException {
		
		/*System.setProperty("webdriver.ie.driver", "F:\\Training\\SeleniumSupport\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();*/
		
		ProfilesIni profiles = new ProfilesIni();

		FirefoxProfile profileSlenium =  profiles.getProfile("Selenium");
						
		WebDriver driver = new FirefoxDriver(profileSlenium);		
		
		driver.get("https://login.salesforce.com/");
		
		/*WebElement loginButton = driver.findElement(By.id("button-login"));
		loginButton.click();
		
		Thread.sleep(3000);*/
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sreenivasparimi95@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("password");
		
		driver.findElement(By.id("Login")).click();			
		
		driver.findElement(By.className(""));
		
		

/*		Thread.sleep(4000);
		
		driver.close();*/

	}

}
