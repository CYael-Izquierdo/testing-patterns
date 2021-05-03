package org.cizquierdo.PageObjects;


import org.cizquierdo.PageComponents.FooterNav;
import org.cizquierdo.PageComponents.NavigationBar;
import org.openqa.selenium.WebDriver;

/*
* Class responsibility:
*   Redirect to another page classes.
* */
public class TravelHomePage {

    WebDriver driver;

    public TravelHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo() {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }

    public NavigationBar getNavigationBar() {
        return new NavigationBar(driver);
    }

    public FooterNav getFooterNav() {
        return new FooterNav(driver);
    }

}
