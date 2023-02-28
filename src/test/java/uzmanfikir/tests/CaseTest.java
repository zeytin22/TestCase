package uzmanfikir.tests;

import org.testng.annotations.Test;
import uzmanfikir.pages.HomePage;
import uzmanfikir.pages.LoginPage;
import uzmanfikir.utilities.ConfigReader;
import uzmanfikir.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CaseTest {
    @Test
    public void case01Test(){

        String[] usernameArr =ConfigReader.getProperty("username").split(",");
        String[] passArr =ConfigReader.getProperty("password").split(",");
        Random random =new Random();
        int num =random.nextInt(usernameArr.length);

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePage homePage =new HomePage();
        LoginPage loginPage =new LoginPage();
        homePage.loginButton.click();
        int randomNumber =num;

        loginPage.email.sendKeys(usernameArr[num]);
        loginPage.password.sendKeys(passArr[num]);
        loginPage.loginbutton.click();




    }
}
