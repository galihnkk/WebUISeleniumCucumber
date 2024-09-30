package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import static helper.Utility.driver;
import static helper.Utility.startDriver;

public class Hooks {

    @Before
    public void beforeTest() {
        System.out.println("Start of scenario");
        startDriver();

    }

    @After
    public void afterTest() throws InterruptedException {
        System.out.println("End of scenario");
        Thread.sleep(2000);
        driver.close();
    }

}