package assignment9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartWithTest {
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
	public void testInput () {
		WebElement inputEntered = driver.findElement
				(By.xpath("//input[starts-with(@id, 'tool')]"));
		inputEntered.sendKeys("hi heba basil ! ");
		
		
		
		
		
	
	}
	@Test
	public void testInput2 () {
		WebElement inputEntered2 = driver.findElement
				(By.xpath("//input[starts-with(@id, 'snam')]"));
		inputEntered2.sendKeys("hi heba basil abo kwaik ! ");
		
		
	}
@Test
	public void doubleClickTest () {
		WebElement doubleBtn = driver.findElement
				(By.xpath("//button[starts-with(@ondblclick,'my')]"));
		Actions action = new Actions(driver);

		action.doubleClick(doubleBtn).perform();

		
	}

}
