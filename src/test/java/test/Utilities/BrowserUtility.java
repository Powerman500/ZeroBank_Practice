package test.Utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtility {

    public static void pause(int second){

        try{
            Thread.sleep(1000);

        }catch (Exception e){
            System.out.println("There is something wrong with pause method");
        }
    }
    // this method accept List<WebElement> and return List<String>
    public static List<String> getElementText(List<WebElement> webElementList){
        // placeholder empty list of web element
        List<String> webElementsAsString = new ArrayList<>();

        //looping through list of web elements and storing text into placeholder list
        for (WebElement each : webElementList) {
            webElementsAsString.add(each.getText());
        }

        return webElementsAsString;
    }
    /*

         Method to assert title

     */
    public static void titleVerification(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }
    // copy whatever you have from previes project
}
