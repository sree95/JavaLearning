package InputTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com/");		
		
		WebElement Month = driver.findElement(By.xpath("//*[@id='month']"));
		
		Month.click();
		   
		driver.findElement(By.xpath("//option[@value='5']")).click();
		  
		

	}

}
