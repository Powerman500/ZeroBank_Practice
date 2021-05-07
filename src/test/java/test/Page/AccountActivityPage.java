package test.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.Utilities.Driver;

public class AccountActivityPage {

    public AccountActivityPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="aa_accountId")
    public WebElement accountDropdown;
}
