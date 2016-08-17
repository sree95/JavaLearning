package InputTags;

import org.jboss.netty.handler.codec.http.websocketx.WebSocketVersion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.w3schools.com/html/tryit.asp?filename=tryhtml_radio");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//input[@value = 'male']")).click();
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
