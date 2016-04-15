package pages;

public class WorkPage extends BasePAgeObject {

    private String findElementName = "#user-signin";
    private String findElementPassword = "#pass-signin";
    private String clickLogin = "#signin-button";

    public void navigateToLoginPage(){
        searchurl("https://mailwk007.okta.com/login/login.htm");
    }
    public void login(String userName,String password){
        AccountPage accountPageObject;//описание
        accountPageObject= new AccountPage();//создали (инициализировали новый обьект accountPage)
        inputText(findElementName,userName);//findElement-findPassword- описанны выше,уже не применять в аргументах метода

        inputText(findElementPassword,password);

        clickButton(clickLogin);//описание в BasePAgeObject
        waitTillElementLoaded(accountPageObject.clickOnApp,5);
      }


    }



