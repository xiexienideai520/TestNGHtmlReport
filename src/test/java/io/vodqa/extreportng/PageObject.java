package io.vodqa.extreportng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SergioLeone on 16/05/2017.
 */
public class PageObject {
    private WebDriver driver;

    @FindBy (xpath = "//a[@href=\'/geolocation\']")
    public WebElement GEOLOCATION_LINK;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }
}
