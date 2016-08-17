package NextGenConcepts;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	@Test
	public void upload() throws IOException {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		//driver.findElement(By.id("photo")).sendKeys("C:\\Users\\sreenivas\\Desktop\\image\\download.jpg");
		
		driver.findElement(By.id("photo")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\sreenivas\\Desktop\\image\\aIt.exe");
		
		
	}
	
}
