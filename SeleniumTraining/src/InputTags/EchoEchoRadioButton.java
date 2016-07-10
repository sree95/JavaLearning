package InputTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EchoEchoRadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.findElement(By.xpath("//input[@value = 'Milk']")).click();
		
		driver.findElement(By.xpath("//input[@value = 'Beer']")).click();
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
