package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Test1.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Администратор on 14.04.2016.
 */
public class BasePAgeObject extends Driver {
    public void searchurl(String url) {
        driver.get(url);
    }

    public void waitTillElementLoaded(String locator, int coolDown) {
        WebDriverWait waiter = new WebDriverWait(driver, coolDown);
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }


    public void inputText(String findElementName, String textToInput) {
        driver.findElement(By.cssSelector(findElementName)).sendKeys(textToInput);//всё указано на WorkPage
    }

    public void clickButton(String buttonCss)
    //clickButton-общий метод для вызова селектора для нажатия в любой старнице;
    //WorkPage-clickButton(clickLogin)   AccountPage-clickButton(clickOnApp)
    {
        driver.findElement(By.cssSelector(buttonCss)).click();
    }


}


