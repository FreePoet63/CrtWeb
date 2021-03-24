package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicClass {

    public void SearchGoogle() {
        $(By.xpath("//input[@title=\"Поиск\"]")).setValue("crtweb.ru").pressEnter();
    }

    public void crtwebPageGoIt(String text) {
        $(By.xpath("//*[contains(text(), \"" + text + "\")]")).click();
    }
}
