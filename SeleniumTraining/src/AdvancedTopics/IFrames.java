package AdvancedTopics;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrames {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*IFrames iff = new IFrames();
		iff.frameOperations();*/
	
	}

	public static void frameOperations() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/framenest.htm");
		
		WebElement frameElemnet = driver.findElement(By.xpath("//frame[@src ='message.htm']"));
		
		driver.switchTo().frame(frameElemnet);
		
		driver.findElement(By.xpath("//textarea[@name = 'suggestions']")).sendKeys("New Message");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//a[@href = 'htmltry.htm']")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
