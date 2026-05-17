package assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ORTest {
	WebDriver driver;
	@BeforeMethod 
	public void setup() {
		  WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.get("https://only-testing-blog.blogspot.com");

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		    while (true) {
		        try {
		            wait.until(ExpectedConditions.alertIsPresent());
		            driver.switchTo().alert().accept();
		            System.out.println("Alert accepted");
		        } catch (Exception e) {
		            System.out.println("No more alerts");
		            break;
		        }
		    }
	}
	
	
	@Test
	public void DateTest () {
		WebElement dateEntered = driver.findElement(By.xpath("//input[@id=\"datePicker\" or @type=\"date\"]"));
		dateEntered.clear();
		dateEntered.sendKeys("15052026");
		System.out.println("THE TSET Date  DONE ");
		
		
		
	}
	
	
	
	
	@Test
	public void LinkTest () {
		WebElement lickClick = driver.findElement
				(By.xpath("//a[@id=\"sampleLink\" and @target=\"_blank\"]"));
		lickClick.click();
		System.out.println("THE TSET click  DONE ");
		
		
	}

		@Test
	public void testText () {
		  WebElement textEntered = driver.findElement(By.xpath("//input[@id=\"gparent_1\" or @type=\"submit\"]"));
		  textEntered.sendKeys("hello ! ");
		  System.out.println("Test done ");

		}
	
}
