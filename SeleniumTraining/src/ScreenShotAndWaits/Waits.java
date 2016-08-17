package ScreenShotAndWaits;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("http://www.bseindia.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
				
		WebElement market = driver.findElement(By.xpath("//*[@id='db-slide-five']"));
		
		wait.until(ExpectedConditions.visibilityOf(market));
		
		market.click();
		
		System.out.println(driver.findElement(By.xpath("//table[@cellspacing = '1']/tbody/tr[14]/td[2]/b")).getText());
		
		
	
	}

}
