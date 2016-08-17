package ScreenShotAndWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class AjaxCalenderPanel {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		
		WebElement seven =  driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceholder1_RadCalendar1_Top']/tbody/tr[2]/td[5]/a"));				
		
		seven.click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);				
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ContentPlaceholder1_RadAjaxLoadingPanel1ctl00_ContentPlaceholder1_RadCalendar1")));
						
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ContentPlaceholder1_RadCalendar1_Top']/tbody/tr[4]/td[6]/a")));
		
		//wait.until(ExpectedConditions.elementToBeClickable(twentyTwo));
		
		WebElement twentyTwo = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceholder1_RadCalendar1_Top']/tbody/tr[4]/td[6]/a"));
		
		twentyTwo.click();		
						
		//WebElement textPlaceholder = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceholder1_Label1']"));
		
		//System.out.println(textPlaceholder.getText());	
		
		(new WebDriverWait(driver, 20)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return (d.findElement(By.xpath("//*[@id='ctl00_ContentPlaceholder1_Label1']")).getText()).contains("Friday, July 22, 2016");
			}});	
		
		//wait.until(ExpectedConditions.textToBePresentInElement(textPlaceholder,"Thursday, July 07, 2016\nFriday, July 22, 2016"));
		
		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceholder1_Label1']")).getText());

	}

}
