package features.steps;

import cucumber.api.java.*;
import pages.BasePage;

public class Hooks extends BasePage {
    @Before
    public void setUP() {
        setDriver();
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
