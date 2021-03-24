package Steps;

import Pages.BasicClass;
import io.cucumber.java.en.Then;

public class SearchCrtweb {
    BasicClass basic = new BasicClass();

    @Then("Find a {string} website and go to it")
    public void findAWebsiteAndGoToIt(String arg0) {
        basic.SearchGoogle();
        basic.crtwebPageGoIt(arg0);
    }
}
