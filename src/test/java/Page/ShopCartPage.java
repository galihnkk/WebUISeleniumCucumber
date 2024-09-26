package Page;

import static Helper.Utility.driver;
import static org.junit.Assert.assertTrue;

public class ShopCartPage {

    public String[] listItemDisplayed = {"empty","Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket","Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)"};

    public void itemAreDisplayedInTheShoppingCartList(int itemNumberDisplayed){
        assertTrue(driver.getPageSource().contains(listItemDisplayed[itemNumberDisplayed]));
    }
}