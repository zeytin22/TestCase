package uzmanfikir.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(uzmanfikir.utilities.Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginbutton;

    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement hataYazisi;
}

