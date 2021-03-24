package Steps;

import Pages.CrtwebContactsPage;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;


public class SeeDataCrtwebContacts {
    CrtwebContactsPage crtwebContactsPage = new CrtwebContactsPage();

    @SuppressWarnings("unchecked")
    @Then("Checking the displayed data on the Crtweb page: address, phone, email")
    public void checkingTheDisplayedDataOnTheCrtwebPageAddressPhoneEmail() {
       List<SelenideElement> ele = crtwebContactsPage.seeDataCrtweb();
       assertThat(ele, hasItems(hasText(containsString("Головной офис")),hasText(containsString("" +
               "Москва, Пресненская набережная, 12")),hasText(containsString("Офис разработки")),
               hasText(containsString("Тюмень, ул. Малыгина 84 к1, 7 этаж")),
               hasText(containsString("+7 (499) 113-68-89")),hasText(containsString("mail@crtweb.ru"))));
    }
}
