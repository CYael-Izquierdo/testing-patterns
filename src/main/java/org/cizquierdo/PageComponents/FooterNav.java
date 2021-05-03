package org.cizquierdo.PageComponents;

import org.cizquierdo.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterNav extends AbstractComponent {
    /*
    When selenium executes any method in this class, scope of selenium
    should be in the footer element only.
     */
    private static By sectionLocator = By.id("traveller-home");
    private By flights = By.cssSelector("[title='Flights']");
    private By links = By.cssSelector("a");

    public FooterNav(WebDriver driver) {
        super(driver, sectionLocator);
    }

    // Method to handle flights
    public String getFlightClass() {
        return findElement(flights).getAttribute("class");
    }

    public int getLinkCount() {
        return findElements(links).size();
    }
}
