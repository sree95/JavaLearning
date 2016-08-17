package ScreenShotAndWaits;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WaitTelerikTimer {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
		
		driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/overview/defaultcs.aspx");
		
		driver.findElement(By.xpath("//*[@id='ctl00_ConfiguratorPlaceholder_ConfigurationPanel1_CheckBox1']")).click();
			
		driver.findElement(By.xpath("//*[@id='ctl00_ConfiguratorPlaceholder_ConfigurationPanel1_RadNumericTextBox1_SpinDownButton']")).click();
	}

}
