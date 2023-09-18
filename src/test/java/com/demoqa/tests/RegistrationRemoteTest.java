package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static com.demoqa.utils.TestDateProperties.*;

public class RegistrationRemoteTest extends RemoteTestBase {

    @Test
    @Tag("remote")
    @DisplayName("Success Registration")
    void successRegistrationFormTest() {
        RegistrationPage registrationPage = new RegistrationPage();
        step("Open and fill form", () ->{
            registrationPage.openPage()
                    .closeBanners()
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setEmail(email)
                    .setGender(gender)
                    .setUserNumber(phone)
                    .setDateBirth(day, month, year)
                    .setSubject(subject)
                    .setHobbies(hobie)
                    .setPicture(picture)
                    .setAddress(address)
                    .setState(state)
                    .setCty(city)
                    .saveProfile();
        });
        step("Verify results", () ->{
            registrationPage.checkResultTableVisible("Thanks for submitting the form")
                    .checkResult(firstName)
                    .checkResult(lastName)
                    .checkResult(email)
                    .checkResult(phone);
        });
    }
}
