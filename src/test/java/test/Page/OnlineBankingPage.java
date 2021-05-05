package test.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.Utilities.Driver;

public class OnlineBankingPage {

    public OnlineBankingPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id="account_summary_link")
    public WebElement accountSummary;

    @FindBy(id="account_activity_link")
    public WebElement accountActivity;

    @FindBy(id="transfer_funds_link")
    public WebElement transferFunds;

    @FindBy(id="pay_bills_link")
    public WebElement payBills;

    @FindBy(id="money_map_link")
    public WebElement myMoneyMap;

    @FindBy(id="online_statements_link")
    public WebElement onlineStatement;

}
