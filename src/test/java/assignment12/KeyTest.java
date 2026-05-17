package assignment12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class KeyTest {
	WebDriver driver;
	
	@BeforeMethod 
	public void setup () {
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		
	}
	@Test
	public void keyTest() throws InterruptedException 
	{
		
		WebElement textArea = driver.findElement
				(By.xpath("//textarea[@id=\"ta1\"]"));
		textArea.sendKeys("hello heba basil abo kwaik ! ");
		textArea.sendKeys(Keys.ENTER);
		
		
		
		
	}
}
