package selenium.geek.girl.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * This class automates the hotel front door page for KAYAK
 * @author elica
 *
 */
public class TestClass extends TestBase{

    /**
     * This test will check the existance of the Wherebox on Kayak/hotels front door
     */
    @Test
    public void testWhereBox() {
        
        WebElement element;

        element = driver.findElement(By.xpath("//input[@id='wherebox']"));
        assertTrue("The wherebox should be shown in the first page.", 
                   element.isDisplayed());
        
    }

    /**
     * Make sure that after each search on KAYAK/hotels
     * the page will land on hotelResult page
     */
    @Test
    public void testHotelSearch() {
        //define all the WebElements
        WebElement where = driver.findElement(By.xpath("//input[@id='wherebox']"));
        WebElement searchButton = driver.findElement(By.id("fdimgbutton"));
        WebElement checkInDate = driver.findElement(By.id("travel_dates-start"));
        WebElement checkOutDate = driver.findElement(By.id("travel_dates-end"));
        
        //set wherebox to Boston , MA
        where.sendKeys("Boston, MA");
        //set the dates
        checkInDate.click();
        checkOutDate.click();
        //click on search button
        searchButton.click();   
        //wait for some 10 seconds
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //make sure it lands on the hotel result page
        WebElement mapHolder = driver.findElement(By.xpath(".//*[contains(@class, 'staticMapHolder')]"));
        assertTrue("It should land on hotel result page!", mapHolder.isDisplayed());
    }
    
}
