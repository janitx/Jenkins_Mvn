import model.AllCredentialsModel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.PropertiesReader;
import utils.XmlToModelReader;

import static pages.HomePage.getHomePage;
import static pages.SignInPage.getSignInPage;

public class SignInTest extends BaseTest {

    String expectedUrl = new PropertiesReader().getExpUrl();

    @DataProvider(name = "LoginData")
    public Object[][] getData() {

        AllCredentialsModel model = XmlToModelReader.read(new PropertiesReader().getPathToFileXml());

        Object[][] array = model.getCollection().stream()
                .map(credentialsModel -> new Object[]{
                        credentialsModel.getEmail(), credentialsModel.getPassword(), credentialsModel.getExp()
                }).toArray(Object[][]::new);

        return array;
    }

    //check login with valid and invalid credentials
    @Test(dataProvider = "LoginData")
    public void loginTest(String email, String password, String exp) {

        getHomePage(driver).clickSignInLink();

        String currentUrl = getSignInPage(driver).enterEmail(email).enterPassword(password).clickSignInButton().getCurrentUrl();

        if (exp.equals("Valid")) {
            Assert.assertTrue(expectedUrl.equals(currentUrl));
        }

        if (exp.equals("Invalid")) {
            Assert.assertFalse(expectedUrl.equals(currentUrl));
        }


    }
}


