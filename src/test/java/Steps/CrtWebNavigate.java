package Steps;

import Pages.CrtwebPage;
import io.cucumber.java.en.Then;

public class CrtWebNavigate {
    CrtwebPage crtwebPage = new CrtwebPage();

    @Then("In the menu of the main page, select contacts {string}, and go to the page")
    public void inTheMenuOfTheMainPageSelectContactsAndGoToThePage(String arg0) {
        crtwebPage.clickCrtwebPageMenu();
        crtwebPage.clickContacts(arg0);
    }
}
