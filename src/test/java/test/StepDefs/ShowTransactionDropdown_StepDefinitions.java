package test.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.Page.AccountActivityPage;
import test.Page.BasePage;
import test.Page.LoginPage;
import test.Utilities.BrowserUtility;
import test.Utilities.Driver;

import java.util.List;

public class ShowTransactionDropdown_StepDefinitions {

    BasePage basePage = new BasePage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @When("I click the transaction dropdown")
    public void i_click_the_transaction_dropdown() {
       basePage.checkingAccountActivity.click();
       BrowserUtility.pause(5);
       accountActivityPage.accountDropdown.click();
    }
    @Then("All the select options should be show")
    public void all_the_select_options_should_be_show(List<String> expectedResult) {

       Select accountDropdown = new Select(accountActivityPage.accountDropdown);

        List<String> actualResult = BrowserUtility.getElementText(accountDropdown.getOptions());

        System.out.println("expectedResult = " + expectedResult);
        System.out.println("actualResult = " + actualResult);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
