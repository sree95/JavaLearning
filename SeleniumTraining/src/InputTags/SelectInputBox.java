package InputTags;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectInputBox {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement element = driver.findElement(By.tagName("select"));
		
		
		//Approach 1
		
		/*Select selectTag = new Select(element);
		
		selectTag.selectByValue("opel");
		
		List<WebElement> options =  selectTag.getOptions();
		
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}*/
		
		// Approach 2
		
		/*element.click();
		
		driver.findElement(By.xpath("//option[@value = 'opel']")).click();*/
		
		// Approach 3
		
		//element.sendKeys("o");		
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
