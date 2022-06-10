import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PropertiesReader;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(new PropertiesReader().getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
