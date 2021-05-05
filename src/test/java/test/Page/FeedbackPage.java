package test.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.Utilities.Driver;

public class FeedbackPage {

    public FeedbackPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id= "name")
    public WebElement name;

    @FindBy(id= "email")
    public WebElement email;

    @FindBy(id= "subject")
    public WebElement subject;

    @FindBy(id= "comment")
    public WebElement comment;

    @FindBy(xpath= "//input[@type='submit']")
    public WebElement sendMessage;

    @FindBy(xpath= "//input[@type='reset']")
    public WebElement clear;
}
