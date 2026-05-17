package assignment16;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTest {
	WebDriver driver ;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	}
	@Test 
	public void simpleAlertTest () {
		WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		clickBtn.click();
		driver.switchTo().alert().accept();
		
	}
	@Test 
	public void confirmAlert() {
		WebElement clickConfirmBtn = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		clickConfirmBtn.click();
		driver.switchTo().alert().dismiss();


	}
	@Test
	public void promptAlertTest() {
		WebElement clickPromptBtn = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		clickPromptBtn.click();
		Alert alertEntered = driver.switchTo().alert();
		System.out.println("Alert Text is : "+alertEntered.getText());
		alertEntered.sendKeys("hello heba ! ");
		alertEntered.accept();

	}

}
