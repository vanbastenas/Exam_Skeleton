package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "input")
    private WebElement input;

    @FindBy(css = "button")
    private WebElement button;

    @FindBy(css = "div")
    private WebElement div;

    public WebElement getErrorWebElement() {
        return error;
    }

    @FindBy(css = "error")
    private WebElement error;

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    public void setInputUserName(String userName) {
        input.sendKeys(userName);

    }

    public void setInputPassword(String password) {
        input.sendKeys(password);
    }

    public void clickButton() {
        button.click();
    }

    public boolean isErrorDisplayed() {
        return error.isDisplayed();
    }

    public WebElement getErrorText() {
        return error.getText();
    }
}






