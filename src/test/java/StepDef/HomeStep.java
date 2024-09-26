package StepDef;

import Page.HomePage;
import Page.LoginPage;
import Page.ShopCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStep {

    LoginPage loginPage;
    HomePage homePage;
    ShopCartPage shopCartPage;


    public HomeStep(){
        this.loginPage = new LoginPage();
        this.homePage = new HomePage();
        this.shopCartPage = new ShopCartPage();
    }

    @Given("user is in homepage login with username {string} and password {string}")
    public void userIsInHomepageLoginWithUsernameAndPassword(String username, String password) {
        loginPage.userGoToLoginPage();
        loginPage.userInputEmail(username);
        loginPage.userInputPassword(password);
        loginPage.userClickLoginButton();
    }

    @When("user click shopping cart icon")
    public void user_click_shopping_cart_icon() {
        homePage.clickShoppingCartIcon();
    }

    @When("user click add to cart button for item {int}")
    public void userClickAddToCartButtonForItem(int itemNumber) {
        homePage.clickAddToCartIcon(itemNumber);
    }

    @Then("item {int} are displayed in the shopping cart list")
    public void itemAreDisplayedInTheShoppingCartList(int itemNumberDisplayed) {
        shopCartPage.itemAreDisplayedInTheShoppingCartList(itemNumberDisplayed);
    }
}