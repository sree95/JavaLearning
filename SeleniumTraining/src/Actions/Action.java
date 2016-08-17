package Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

  public class Action {

	@Test
	public void ActClass(){
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
		
		driver.switchTo().frame(0);
		
		WebElement sourceElement = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement distElement = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		/*act.clickAndHold(element).build().perform();
		act.moveByOffset(20, 30).build().perform();
		act.release().build().perform();*/
		
		//driver.findElement(By.xpath("//a[@href = 'http://contribute.jquery.org/code/']")).click();
		
		//act.dragAndDrop(sourceElement, distElement).build().perform();
		
		sourceElement.sendKeys(Keys.SHIFT,Keys.F10);
		
		Point point = sourceElement.getLocation();
		
		System.out.println(point.x);
		System.out.println(point.y);
		
	}
	
	
	
}
