package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementUsingName {
	  WebDriver driver ;
	@BeforeMethod
	public void openBroswer() {
		
		   WebDriverManager.chromedriver().setup();
	         driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/login");
	}
@Test 
public void testLogin() {
	
	WebElement usernameField = driver.findElement(By.name("username"));
	usernameField.sendKeys("tomsmith");
	WebElement passwordField = driver.findElement(By.name("password"));
    passwordField.sendKeys("SuperSecretPassword!");
    
    System.out.println("Successfully located elements by name and entered text.");
}

}
