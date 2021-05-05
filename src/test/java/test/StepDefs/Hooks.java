package test.StepDefs;

import test.Utilities.BrowserUtility;
import test.Utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDown() throws Exception {

        BrowserUtility.pause(1);

        Driver.closeDriver();

    }
}
