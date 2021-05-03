package org.cizquierdo.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractComponent {

    protected WebElement sectionElement;

    public AbstractComponent(WebDriver driver, By section) {
        this.sectionElement = driver.findElement(section);
    }

    protected WebElement findElement(By by) {
        return sectionElement.findElement(by);
    }

    protected List<WebElement> findElements(By by) {
        return sectionElement.findElements(by);
    }

}
