package test.Page;

import org.openqa.selenium.support.PageFactory;
import test.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="user_login")
    public WebElement usernameInput;

    @FindBy(id= "user_password")
    public WebElement passwordInput;

    @FindBy(name= "submit")
    public WebElement signInButton;

    @FindBy(id="primary-button")
    public WebElement backToPrimary;

}
