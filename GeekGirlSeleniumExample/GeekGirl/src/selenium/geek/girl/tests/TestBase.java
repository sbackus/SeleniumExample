package selenium.geek.girl.tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * The base class for Selenium Page Object tests, run using either JUnit or
 * TestNG, containing logic to run before the tests start and after they are
 * done, and including various convenience methods called by the actual tests.
 * 
 * @author elica
 *
 */
public class TestBase {

    /** The Selenium WebDriver, used to control the browser. */
    public static WebDriver driver;

    /**
     * Set up the driver with the default selenium browser
     */
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://www.kayak.com");
    }

    /**
     * Set up the end test, so after each test this
     * will wrap up the test and close the browser
     */
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
