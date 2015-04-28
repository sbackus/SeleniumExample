package selenium.geek.girl;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestClass extends TestBase{

    /**
     * This test will check the existance of the Wherebox on Kayak/hotels front door
     */
    @Test
    public void testMethod() {
        driver.get("http://www.kayak.com/hotels");

        WebElement element;

        element = driver.findElement(By.xpath("//input[@id='wherebox']"));
        assertTrue("The wherebox should be shown in the first page.", 
                   element.isDisplayed());
    }

}
