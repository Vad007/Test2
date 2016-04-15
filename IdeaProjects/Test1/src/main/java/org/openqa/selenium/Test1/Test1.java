package org.openqa.selenium.Test1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Администратор on 14.04.2016.
 */
public class Test1 extends Driver {
@BeforeTest
    public void startTest1(){
        startWebDriver();}
    @AfterTest
    public void stopTest1(){
        breakWebDriver();
    }
    @Test

    public void  Test1(){
        WorkPage work = new WorkPage();
        AccountPage account = new AccountPage();

        work.navigateToLoginPage();
        work.login("wk007@mail.ru","Abcd1234");//актион клик описан в WorkPage

        account.clickOnApps();
     }

  }
