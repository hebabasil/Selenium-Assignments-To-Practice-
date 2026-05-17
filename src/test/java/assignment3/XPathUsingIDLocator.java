package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathUsingIDLocator {
	 public static void main( String[] args )
	    
	    {
	    	WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
    driver.findElement(By.xpath("//*[@id=\"user-name\"]")).click();
	    }

}
