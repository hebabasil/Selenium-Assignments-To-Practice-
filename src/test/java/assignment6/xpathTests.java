package assignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class xpathTests {
	WebDriver driver;

	@BeforeMethod
	public void setup() {

		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		driver = new ChromeDriver(options);
		driver.get("https://only-testing-blog.blogspot.com");
	}

	@Test
	public void checkAlertBtn() {

		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		System.out.println("THE TSET Alert DONE ");

	}

	@Test
	public void checkDateInput() {

		WebElement date = driver.findElement(By.xpath("//input[@id='nativeDate']"));
		date.clear();
		date.sendKeys("13052026");
		System.out.println("THE TSET Date  DONE ");

	}

	@Test
	public void checkboxesTest() {

		WebElement checkbox = driver.findElement(By.xpath("//input[contains(@id, 'checkbox')]"));
		checkbox.click();

		System.out.println("THE TSET Checkboxes1  DONE ");

	}

	@Test
	public void inputTest() {

		WebElement input = driver.findElement(By.xpath("//input[@id='textInput']"));
		input.sendKeys("heba basil");

		System.out.println("THE TSET text in Textbox  DONE ");

	}

	@Test
	public void selectTest() {

		WebElement select = driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]"));
		select.click();

		System.out.println("THE TSET select country  DONE ");

	}
}