package page;

import org.openqa.selenium.By;

import static helper.Utility.driver;
import static org.junit.Assert.assertEquals;

public class LoginPage {

    By inputEmailLocator = By.id("user-name");
    By inputPasswordLocator = By.id("password");
    By loginButtonLocator = By.id("login-button");
    By errorMessageLocator = By.cssSelector("#login_button_container > div > form > h3");

    public void userGoToLoginPage() {
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    public void userInputEmail(String username) {
        driver.findElement(inputEmailLocator).sendKeys(username);
    }

    public void userInputPassword(String password) {
        driver.findElement(inputPasswordLocator).sendKeys(password);
    }

    public void userClickLoginButton() {
        driver.findElement(loginButtonLocator).click();
    }

    public void loginPageWillDisplayErrorMessage(String errorMessage) {
        assertEquals(errorMessage,driver.findElement(errorMessageLocator).getText());
    }

}