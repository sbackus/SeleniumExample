package selenium.geek.girl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class TestClass {

    public static WebDriverWait wait;

    public static WebDriver driver;

    @Before
    public void setUp() {

        driver = new FirefoxDriver();

    }

    @Test
    public void testMethod() throws InterruptedException{
        driver.get("http://www.google.com");
        
        WebElement element;

        element = driver.findElement(By.xpath("//input[@id='lst-ib']"));
        assertTrue(element.isDisplayed());
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
