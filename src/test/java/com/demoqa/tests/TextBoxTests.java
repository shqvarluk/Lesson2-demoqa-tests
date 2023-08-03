package com.demoqa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 240000;
    }
    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Ivanov Ivan");
        $("#userEmail").setValue("Ivanov@m.ru");
        $("#currentAddress").setValue("Ex currentAddressss");
        $("#permanentAddress").setValue("Ex permanentAddressss");
        $("#submit").click();

        $("#output #name").shouldHave(Condition.text("Ivanov Ivan"));
        $("#output #email").shouldHave(Condition.text("Ivanov@m.ru"));
        $("#output #currentAddress").shouldHave(Condition.text("Ex currentAddressss"));
        $("#output #permanentAddress").shouldHave(Condition.text("Ex permanentAddressss"));
    }
}
