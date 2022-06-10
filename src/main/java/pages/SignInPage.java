package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(xpath = "(//input[@type='email'])[1]")
    private WebElement emailField;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Sign In')]")
    private WebElement signInButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage enterEmail(final String email) {
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public SignInPage enterPassword(final String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    public SignInPage clickSignInButton() {
        signInButton.click();
        return this;
    }

    public boolean isEmailFieldVisible() {
        return emailField.isDisplayed();
    }

    public boolean isPasswordFieldVisible() {
        return passwordField.isDisplayed();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public static SignInPage getSignInPage(WebDriver driver) {
        return new SignInPage(driver);
    }
}
