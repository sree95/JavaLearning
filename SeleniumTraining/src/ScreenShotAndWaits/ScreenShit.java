package ScreenShotAndWaits;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShit {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		ScreenShot("GooglePage");
					
		Thread.sleep(2000);
		
		
		
		driver.close();
		
		
		

	}
	
	
	public static void ScreenShot(String name) throws IOException
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\ScreenShot\\"+name+".png"));
	}
	
	
	
	

}
