package ScreenShotAndWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbhiBus {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		 driver.get("http://www.ticketfly.com/");
		 
		 driver.findElement(By.xpath("//*[@id='change-location']/span")).click();
		 
		 driver.findElement(By.xpath("//*[@id='tab-ca']/a")).click();
		 
		 //driver.findElement(By.xpath("//a[text() = 'All Canada']")).click();
		 
		 //WebElement allCanada = driver.findElement(By.xpath("//a[text() = 'All Canada']"));
		 
		 FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
				 .withTimeout(30, TimeUnit.SECONDS)
				 .pollingEvery(2, TimeUnit.SECONDS)
				 .ignoring(NoSuchElementException.class);		 				 
		 
		 fWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text() = 'All Canad']")));
		 
		 //allCanada.click();
		 	
		 		
		 

	}

}
