package org.cizquierdo;

import org.cizquierdo.PageObjects.TravelHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void flightTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/yael/Documents/BrowserDrivers/chrome/89/chromedriver");
        WebDriver driver = new ChromeDriver();

        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();

        System.out.println(travelHomePage.getFooterNav().getFlightClass());
        System.out.println(travelHomePage.getNavigationBar().getFlightClass());
        System.out.println(travelHomePage.getFooterNav().getLinkCount());
        System.out.println(travelHomePage.getNavigationBar().getLinkCount());

        // checkAvailability(origin, destination) - one way, round trip, multi trip


        driver.quit();
    }

}
