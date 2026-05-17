package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CourseraLoginTest {
	WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.coursera.org");
    }

    @Test
    public void SearchTest() {
    WebElement search = driver.findElement(By.id("search-autocomplete-input"));
    System.out.println("Element found successfully using id " );
    search.sendKeys("SQA ");
 

    System.out.println("Text entered into the search box.");


    

}}
