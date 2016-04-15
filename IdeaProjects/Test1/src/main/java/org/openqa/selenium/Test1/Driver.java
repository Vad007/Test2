package org.openqa.selenium.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    public static WebDriver driver;
    public void startWebDriver(){
        driver = new FirefoxDriver();
    }
    public void breakWebDriver(){
        driver.close();
    }
}
