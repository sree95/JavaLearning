package NextGenConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class EventFiringDriver {

	@Test
	public void EDrive() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();		
		
		EventFiringWebDriver efDriver = new EventFiringWebDriver(driver);
		
		EventHandling eventHandler = new EventHandling();
		
		efDriver.register(eventHandler);				
		
		efDriver.navigate().to("https://accounts.google.com/");
		
		efDriver.findElement(By.xpath("//*[@id='Email']")).sendKeys("sreenivasparimi95@gmail.com");
		
		efDriver.findElement(By.xpath("//*[@id='next']")).click();
		
		efDriver.navigate().back();				
		
		efDriver.navigate().forward();
		
		efDriver.navigate().refresh();
		
		efDriver.findElement(By.xpath("//*[@id='Email']")).sendKeys("sreenivasparimi95@gmail.com");
		
		efDriver.findElement(By.xpath("//*[@id='next']")).click();

	}
	
}
