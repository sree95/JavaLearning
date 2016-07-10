package InputTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_test");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.tagName("button")).click();		
		
		Thread.sleep(4000);	
		
		driver.close();

	}

}
