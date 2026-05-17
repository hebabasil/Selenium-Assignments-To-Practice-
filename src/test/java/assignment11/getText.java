package assignment11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class getText {
	WebDriver driver;
	
@BeforeMethod 
public void setup () {
	driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com");
	
}
@Test
public void disableBtnTest() {
	
	
    WebElement disabledBtn = driver.findElement(By.xpath("//button[@disabled]"));
    String text = disabledBtn.getText();
    System.out.println("Disabled Button Text: " + text);


	
}
}
