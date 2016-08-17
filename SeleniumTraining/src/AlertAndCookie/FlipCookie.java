package AlertAndCookie;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipCookie {

	@Test
	public void FlipkartCookie() {
		
		WebDriver driver = new  FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.flipkart.com/");
		
		Set<Cookie> coo = driver.manage().getCookies();
		
		for (Cookie cookie : coo) {
			System.out.println("Name: "+ cookie.getName() +" Value: "+ cookie.getValue());
		}
		driver.manage().deleteAllCookies();
	}
	
}
