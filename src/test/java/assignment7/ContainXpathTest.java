package assignment7;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContainXpathTest {
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
public void tsetText () {
  WebElement textEntered = driver.findElement(By.xpath("//input[contains(@id,\"text\")]"));
  textEntered.sendKeys("hello world ! ");
  System.out.println("Test done ");

}
@Test
public void  testClickRightBtn () {
	
	
	WebElement clickRight = driver.findElement(By.xpath("//div[contains(@id,'rightCl')]"));

	Actions action = new Actions(driver);
	action.contextClick(clickRight).perform();

	System.out.println("Test done");
}
@Test
public void testDropDown() {
	
	WebElement clickDrop = driver.findElement(By.xpath("//select[contains(@id,'drop')]"));
	Select objSelect=new Select(clickDrop);
	objSelect.selectByIndex(1);
	System.out.println("Select USA Done ! ");

	
}


}
