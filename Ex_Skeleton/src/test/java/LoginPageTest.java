import PageObjects.LoginPage;
import PageObjects.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Utilities.WaitUtilities.waitForDisplay;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    MainPage mainPage;
    String validUsername = "standard_user";
    String validPassword = "secret_sauce";
    String invalidUsername = "invalid";
    String invalidPassword = "invalid";

    @Test
    void userCanLogin() {

        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);

        loginPage.setInputUserName(validUsername);
        loginPage.setInputPassword(validPassword);
        loginPage.clickButton();
        Assertions.assertEquals("PRODUCTS", mainPage.getTitle());
    }

    @Test
    void userCannotLogin() {

        loginPage = new LoginPage(driver);
        loginPage.setInputUserName(invalidUsername);
        loginPage.setInputPassword(invalidPassword);
        loginPage.clickButton();
        waitForDisplay(driver, loginPage.getErrorText());
        Assertions.assertTrue(loginPage.isErrorDisplayed());
        assertEquals("Todo", loginPage.getErrorText());
    }
}