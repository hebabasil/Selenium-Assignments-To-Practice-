package assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathUsingClassNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
	        WebElement username = driver.findElement(
	        	    By.xpath("//input[contains(@class,'form_input')]")
	        	);

	        	username.sendKeys("standard_user");
	    	
	    }

	}


