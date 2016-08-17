package InputTags;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithLinks {

	public static void main(String[] args) throws InterruptedException {
		
		boolean flag = true;
		
		WebElement showme = null;
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		//System.out.println(driver.findElement(By.xpath("//a[text() = 'Yes, show me']")).isDisplayed());
		
		
		//WebElement showMe = driver.findElement(By.xpath("//a[text() = 'Yes,']"));
		
		try {
			
			showme = driver.findElement(By.xpath("//a[text() = 'Yes,']"));
			
		} catch (NoSuchElementException e) {
			flag = false;
		}catch (Exception e) {
			flag = false;
		}
		
		if(flag) {
				showme.click();			
		}
					
		System.out.println(flag);
		
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//a[contains(@href ,'%3D&hl=te&source=homepage')]")).click();
		
		driver.close();
		
		

	}

}
