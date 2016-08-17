package Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActExte{

	@Test
	public void Act() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");	
		
		//driver.findElement(By.xpath("//span[text() = 'right click me']")).sendKeys(Keys.SHIFT,Keys.F10);
		
		Actions actions = new Actions(driver);
		actions.keyDown(driver.findElement(By.xpath("//span[text() = 'right click me']")), Keys.SHIFT);
		actions.sendKeys(Keys.F10).build().perform();
		
	}
	
}
