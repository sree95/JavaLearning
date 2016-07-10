package InputTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioCheck {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.quackit.com/html/codes/html_radio_button.cfm");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		WebElement elemnet1  = driver.findElement(By.xpath("//iframe[@name = 'result1']"));
		
		driver.switchTo().frame(elemnet1);
		
		driver.findElement(By.xpath("//input[@value = 'Red']")).click();
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
