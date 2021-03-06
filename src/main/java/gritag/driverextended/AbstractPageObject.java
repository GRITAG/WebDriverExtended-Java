package gritag.driverextended;

import org.openqa.selenium.WebDriver;

/**
 * Created by harolddost on 4/5/16.
 */
public abstract class AbstractPageObject implements PageObject{

    protected WebDriver driver;
    protected Report report;

    
    public void navigate(WebDriver webDriver, String page) {
        webDriver.navigate().to(page);
    }

    
    public void navigate(WebDriver webDriver) {
        navigate(webDriver,getPageUrl());
    }

    
    public void navigate(String s) {
        navigate(driver,s);
    }

   
    public void navigate() {
        navigate(getPageUrl());
    }

    
    public String getPageUrl() {
        return getBaseUrl() + getPath();
    }

   
    public DynamicElement getDynamicElement() {
        return new DynamicElement(driver,report);
    }
}
