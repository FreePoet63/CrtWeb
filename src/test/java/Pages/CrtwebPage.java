package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.*;

public class CrtwebPage {
    public void clickCrtwebPageMenu() {
        $(By.xpath("//input[@type=\"checkbox\"]")).click();
    }

    public void clickContacts(String text) {
        $(By.xpath("//a[contains(text(), \"" + text + "\")]")).click();
    }
}
