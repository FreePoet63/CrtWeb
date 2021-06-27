package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicClass {
    public void searchGoogle() {
        $(By.xpath("//input[@class=\"gLFyf gsfi\"]")).setValue("crtweb.ru").pressEnter();
    }

    public void crtwebPageGoIt(String text) {
        $(By.xpath("//h3[contains(text(), \"" + text + "\")]")).click();
    }
}
