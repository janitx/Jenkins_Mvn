package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "(//a[contains(@href,'account') and @title='User: Login /  Register'])[1]")
    private WebElement signInLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public static HomePage getHomePage(WebDriver driver) {
        return new HomePage(driver);
    }
}
