package Day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElemntsByClassName {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://login.salesforce.com/");
		
		List<WebElement> elements = driver.findElements(By.className("label"));
		
		int count = driver.findElements(By.className("label")).size();
		
		System.out.println(count);
		
		/*for (int i = 0; i < args.length; i = i++) {
			
		}
		
		for (WebElement ele : elements) {
			System.out.println(ele.getText());
		}*/
		
		/*List<String> names = new ArrayList<String>();
		names.add("One");
		names.add("Two");
		names.add("Three");
		names.add("Four");
		names.add("Five");
		
		for (String s : names) {
			System.out.println(s);
		}*/
		
	}
	
}
