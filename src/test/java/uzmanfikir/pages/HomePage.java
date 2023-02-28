package uzmanfikir.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(uzmanfikir.utilities.Driver.getDriver(),this);


    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;
}
