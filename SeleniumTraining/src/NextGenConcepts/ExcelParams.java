package NextGenConcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelParams {

	@Test
	public void Excel() throws IOException, InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		// Reading properties files
		
		Properties configProp = new Properties();
		
		InputStream configIs = new FileInputStream("G:\\Training\\TraningGit\\JavaLearning\\SeleniumTraining\\src\\config.properties");
		
		configProp.load(configIs);
		
		Properties orProperties = new Properties();
		
		InputStream oInputStream = new FileInputStream("G:\\Training\\TraningGit\\JavaLearning\\SeleniumTraining\\src\\OR.properties");
		
		orProperties.load(oInputStream);
		
		
		driver.get(configProp.getProperty("url"));						
		
		//String errText = "The email and password you entered don't match.";
		
		InputStream is = new FileInputStream("G:\\Training\\Data\\Params.xlsx");
		
		Workbook bWorkbook  = new XSSFWorkbook(is);
		
		Sheet sheet = bWorkbook.getSheetAt(0);				
		
		int rowCount = sheet.getLastRowNum();				
		
		for (int i = 1; i <= rowCount; i++) {
			
			Row row = sheet.getRow(i);
			
			 Iterator<Cell> cIterator = row.cellIterator();
			 
			 while (cIterator.hasNext()) {
				
				 Cell cell = cIterator.next();
				
				 driver.findElement(By.xpath(orProperties.getProperty("email"))).sendKeys(cell.getStringCellValue());
				 
				 driver.findElement(By.xpath(orProperties.getProperty("nextlink"))).click();								 
				 
				 cell = cIterator.next();
				 
				 Thread.sleep(1000);
				 				 
				 driver.findElement(By.xpath(orProperties.getProperty("password"))).sendKeys(cell.getStringCellValue());
				 
				 driver.findElement(By.xpath(orProperties.getProperty("signIn"))).click();
				 				 			
				 Assert.assertTrue(driver.findElement(By.xpath(orProperties.getProperty("errorLink"))).getText().contains(orProperties.getProperty("errText")));				 
				 				 
			}			 
			 driver.get(configProp.getProperty("url"));			
		}
	
		driver.close();
	}
	
}
