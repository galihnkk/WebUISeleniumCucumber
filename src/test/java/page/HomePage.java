package page;

import org.openqa.selenium.By;

import static helper.Utility.driver;
import static org.junit.Assert.assertEquals;

public class HomePage {
    By inventoryTitleLocator = By.xpath("//*[@id=\"inventory_filter_container\"]/div");
    By shoppingCartIconLocator = By.xpath("//*[@id=\"shopping_cart_container\"]");

    public void userDirectedToHomepageWithUrl(String homepageUrl) {
        assertEquals(homepageUrl, driver.getCurrentUrl());
    }
    public void checkHomepageInventoryTitle(){
        assertEquals("Products", driver.findElement(inventoryTitleLocator).getText());
    }

    public void clickShoppingCartIcon(){
        driver.findElement(shoppingCartIconLocator).click();
    }

    public void clickAddToCartIcon(int itemNumber){
        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div["+ itemNumber +"]/div[3]/button")).click();
    }
}