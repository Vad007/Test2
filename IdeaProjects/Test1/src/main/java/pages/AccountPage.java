package pages;

/**
 * Created by Администратор on 14.04.2016.
 */
public class AccountPage extends BasePAgeObject{
    public final String clickOnApp = "a[href*=\"codeschool\"]";

    public void clickOnApps() {
        clickButton(clickOnApp);//описание в BasePAgeObject
    }

}