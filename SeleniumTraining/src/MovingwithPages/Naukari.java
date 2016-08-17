package MovingwithPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukari {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.naukri.com/");
		
		List<WebElement> links =  driver.findElement(By.xpath("//*[@id='tabP-1']/ul[@class = 'col fl']/li[2]/ul[@class = 'set']")).findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (WebElement ele : links) {
			
			System.out.println(ele.getText());
			ele.click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
		}
		
	}

}
