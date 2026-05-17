package assignment13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class EnableBtnTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");

	}

	@Test
	public void EnableBtnTest() {
		WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Enable']"));
		enableBtn.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(enableBtn));
		System.out.println("The Btn is enable ? " + enableBtn.isEnabled());
		WebElement disEnableBtn = driver.findElement(By.xpath("//button[text()='Disable']"));
		disEnableBtn.click();
	wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(disEnableBtn)));

		System.out.println("The Btn is enable ? " + disEnableBtn.isEnabled());

	}

}
