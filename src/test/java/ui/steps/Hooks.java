package ui.steps;

import cucumber.api.java.*;
import ui.pages.BasePage;

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
