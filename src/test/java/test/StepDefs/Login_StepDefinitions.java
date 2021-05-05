package test.StepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.Page.LoginPage;

import test.Utilities.BrowserUtility;
import test.Utilities.ConfigurationReader;
import test.Utilities.Driver;

public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        String url = ConfigurationReader.getProperty("zeroBank_url");
        Driver.getDriver().get(url);
    }
    @When("I login as a user")
    public void i_login_as_a_user() {
        String username = ConfigurationReader.getProperty("user_login");
        String password = ConfigurationReader.getProperty("user_password");
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.signInButton.click();
        loginPage.backToPrimary.click();
    }


    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() throws InterruptedException{
        String expectedResult = "Zero - Personal Banking - Loans - Credit Cards";


    //    wait.until(ExpectedConditions.urlContains(expectedResult));

        String actualResult =Driver.getDriver().getTitle();
        BrowserUtility.pause(5);
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
