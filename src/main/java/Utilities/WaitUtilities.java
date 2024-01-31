package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WaitUtilities {
    public static final int DEFAULT_TIME_FOR_WAIT = 5;

    public static void waitForDisplay(WebDriver driver, WebElement webElement) {
        waitForDisplay(driver, webElement, DEFAULT_TIME_FOR_WAIT);

    }

    public static void waitForDisplay(WebDriver driver, WebElement webElement, int timeForWait) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(visibilityOf(webElement));}
}

