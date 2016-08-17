package AdvancedTopics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Driver;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Flipkart {
	
	@Test
	public void SearchBook() throws IOException {

		Properties prop = new Properties();
		
		InputStream is = new FileInputStream("G:\\Training\\TraningGit\\JavaLearning\\SeleniumTraining\\src\\OR.Properties");			
		
		prop.load(is);
		
		Properties configProp = new Properties();
		
		InputStream iss  = new FileInputStream("G:\\Training\\TraningGit\\JavaLearning\\SeleniumTraining\\src\\config.properties");
		
		configProp.load(iss);
		
		//System.out.println(prop.getProperty("book"));
		
		//String book = "43rd Edition(Paperback, B. S. Grewal)";
				
		
		WebDriver driver = new FirefoxDriver();						
		
		driver.manage().window().maximize();
		driver.navigate().to(configProp.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath(prop.getProperty("booksxpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("AcademicXpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("EngeneeringXpath"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("SearchBoxXpath"))).sendKeys(prop.getProperty("book"));
		driver.findElement(By.xpath(prop.getProperty("SearchBoxClick"))).click();
		
		
		try {
			driver.findElement(By.xpath(prop.getProperty("bookTitleXpath"))).click();
		} catch (Exception e) {
			System.out.println("Exception came at book link" + e.getMessage());
		}finally {
			driver.close();			
		}
				
		
		/*List <WebElement> cat = driver.findElements(By.xpath(prop.getProperty("CollectionClass")));
		for(int i=0; i < cat.size();i++){
			System.out.println(cat.get(i).getText());
				if (cat.get(i).getText().contains(prop.getProperty("book"))){
					cat.get(i).click();     
				}
		}
		
		for (WebElement webElement : cat) {
			if (webElement.getAttribute("title").equals(prop.getProperty("bookTitleXpath"))) {
				webElement.click();
			}
			
			System.out.println(webElement.getAttribute("title"));
		}*/
	
	}
}