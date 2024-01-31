package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(css = "input")
    private WebElement input;

    public MainPage(WebDriver driver) {
        super(driver);
    }
    public String getTitle(){
        return input.getText();
    }
}
