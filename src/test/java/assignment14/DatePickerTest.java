package assignment14;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DatePickerTest {
	WebDriver driver ; 
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		
	}
	@Test 
	public void dateTest () {
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement dateBox = driver.findElement(By.id("datepicker"));
		Date date = new Date(); 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = sdf.format(date); 
		dateBox.sendKeys(formattedDate);
		System.out.println("Test date Done ! ");
		
		
		
	}

}
