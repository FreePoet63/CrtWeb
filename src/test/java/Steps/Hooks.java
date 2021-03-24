package Steps;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;


import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void openURL() {
        Configuration.browser = Browsers.FIREFOX;
        Configuration.startMaximized = true;
        open("https://www.google.com/");
        SelenideLogger.addListener("AllureSelenide",new AllureSelenide().savePageSource(true).screenshots(true));
    }
}
