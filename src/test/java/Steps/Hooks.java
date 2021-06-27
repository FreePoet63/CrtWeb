package Steps;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void openURL() {
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = Browsers.FIREFOX;
        Configuration.browserVersion = "88";
        Configuration.startMaximized = true;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        Configuration.browserCapabilities = capabilities;
        open("https://www.google.com/");
    }
}
