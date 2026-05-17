package assignment15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import junit.framework.Assert;

public class CheckboxTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");

	}

	@Test
	public void checkboxTest() throws InterruptedException {
		WebElement checkbox = driver.findElement
				(By.xpath("//input[@type='checkbox'][1]"));
		
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
		System.out.println("After check: " + checkbox.isSelected());
		Assert.assertTrue(checkbox.isSelected());
		Thread.sleep(1000);
		// uncheck
		checkbox.click();

		System.out.println("After uncheck: " + checkbox.isSelected());
		Assert.assertFalse(checkbox.isSelected());
	}
}
