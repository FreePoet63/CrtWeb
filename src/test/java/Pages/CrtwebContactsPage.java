package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CrtwebContactsPage {

    public List<SelenideElement> seeDataCrtweb() {
       return $$(By.xpath("//*[contains(@class, \"tn-atom\")]"));
    }
}
