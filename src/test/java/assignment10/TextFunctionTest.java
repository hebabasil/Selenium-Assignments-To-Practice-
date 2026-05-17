package assignment10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFunctionTest {
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
	public void clickTest() {
		driver.findElement(By.xpath("//button[text()='Load Checkbox']")).click();
        System.out.println("Test done !");

	}
	
	
	@Test 
	public void clickTest1() {
		driver.findElement
		(By.xpath("//button[text()='Show Me Confirmation']")).click();
        System.out.println("Test done !");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test 
	public void clickTest2() {
		driver.findElement
		(By.xpath("//button[text()='Click Me']")).click();
        System.out.println("Test done !");

	}
	
	

}
