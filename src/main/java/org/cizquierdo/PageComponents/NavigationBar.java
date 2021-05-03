package org.cizquierdo.PageComponents;

import org.cizquierdo.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar extends AbstractComponent {

    private static By sectionLocator = By.id("buttons");
    private By flights = By.cssSelector("[title='Flights']");
    private By links = By.cssSelector("a");

    public NavigationBar(WebDriver driver) {
        super(driver, sectionLocator);
    }

    public String getFlightClass() {
        return findElement(flights).getAttribute("class");
    }

    public int getLinkCount() {
        return findElements(links).size();
    }

}
