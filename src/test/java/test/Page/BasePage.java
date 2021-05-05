package test.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.Utilities.Driver;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy (id="homeMenu")
    public WebElement home;

    @FindBy (id="onlineBankingMenu")
    public WebElement onlineBanking;

    @FindBy (id="feedback")
    public WebElement feedback;

    @FindBy (id ="account_activity_link")
    public WebElement checkingAccountActivity;

    @FindBy (id ="transfer_funds_link")
    public WebElement transferFunds;

    @FindBy (id ="money_map_link")
    public WebElement mayMoneyMap;

    @FindBy (id ="searchTerm")
    public WebElement search;

    @FindBy (xpath ="//*[@id=\"settingsBox\"]/ul/li[2]/a")
    public WebElement setting;

    @FindBy (id ="//*[@id=\"settingsBox\"]/ul/li[3]/a")
    public WebElement username;


}
