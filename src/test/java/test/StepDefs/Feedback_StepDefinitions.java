package test.StepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.Page.BasePage;
import test.Page.FeedbackPage;
import test.Utilities.BrowserUtility;
import test.Utilities.Driver;

public class Feedback_StepDefinitions {

    BasePage basePage = new BasePage();
    FeedbackPage feedbackPage = new FeedbackPage();
    WebDriver driver ;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    Faker faker = new Faker();
    String name = faker.name().firstName();
    String email = faker.internet().emailAddress();
    String subject = faker.book().title();
    String comment = faker.backToTheFuture().quote();

    @When("user write the feedback info correctly and submit it")
    public void user_write_the_feedback_info_correctly_and_submit_it() {
        basePage.feedback.click();
        BrowserUtility.pause(1);


        feedbackPage.name.sendKeys(name);
        BrowserUtility.pause(1);
        feedbackPage.email.sendKeys(email);
        BrowserUtility.pause(1);
        feedbackPage.subject.sendKeys(subject);
        BrowserUtility.pause(1);
        feedbackPage.comment.sendKeys(comment);
        BrowserUtility.pause(1);
        feedbackPage.sendMessage.click();
        BrowserUtility.pause(1);

    }

    @Then("success submit reply will be display")
    public void success_submit_reply_will_be_display() {

        boolean displayed = feedbackPage.title.isDisplayed();
        System.out.println(displayed);

    }
}
