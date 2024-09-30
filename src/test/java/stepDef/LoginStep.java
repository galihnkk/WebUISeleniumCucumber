package stepDef;

import page.HomePage;
import page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    LoginPage loginPage;
    HomePage homePage;

    public LoginStep(){
        this.loginPage = new LoginPage();
        this.homePage = new HomePage();
    }

    @Given("user is in login page")
    public void userGoToLoginPage() {
        loginPage.userGoToLoginPage();
    }

    @When("user input username {string}")
    public void userInputEmail(String username) {
        loginPage.userInputEmail(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.userInputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.userClickLoginButton();
    }

    @Then("login page will display error message: {string}")
    public void loginPageWillDisplayErrorMessage(String errorMessage) {
        loginPage.loginPageWillDisplayErrorMessage(errorMessage);
    }

    @Then("user will be directed to homepage with url {string}")
    public void userWillBeDirectedToHomepageWithUrl(String homepageUrl) {
        homePage.userDirectedToHomepageWithUrl(homepageUrl);
        homePage.checkHomepageInventoryTitle();
    }

    @When("user log into the account using username {string} and password {string}")
    public void userLogIntoTheAccountUsingUsernameAndPassword(String username, String password) {
        loginPage.userGoToLoginPage();
        loginPage.userInputEmail(username);
        loginPage.userInputPassword(password);
        loginPage.userClickLoginButton();
    }
}