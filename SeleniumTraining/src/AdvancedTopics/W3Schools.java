package AdvancedTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class W3Schools {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.w3schools.com/html/tryit.asp?filename=tryhtml_radio");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("html/body/form/input[1]")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("html/body/div[2]/ul/li[4]/button")).click();						
		
	}

}
