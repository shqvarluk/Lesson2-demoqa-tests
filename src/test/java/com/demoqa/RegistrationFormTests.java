package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 240000;
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillRegistrationFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Ivanov");
        $("#lastName").setValue("Ivan");
        $("#userEmail").setValue("Ivan@m.ru");
        $("label[for=gender-radio-3]").click();
        $("#userNumber").setValue("0123456789");
        $("#dateOfBirthInput").click();
        $("div[aria-label='Choose Wednesday, July 19th, 2023']").click();
        $("input[id = subjectsInput]").setValue("ex sub");
        $("label[for=hobbies-checkbox-2]").click();
        //$("label[class=form-file-label]").click();

        $("#currentAddress").setValue("address");
        $("#state").click();
        $("div[react-select-3-option-0]").shouldHave(Condition.text("NCR"));




    }
}
