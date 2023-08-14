package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.demoqa.utils.TestDateProperties.*;

public class RegistrationFormWithFakerTests extends TestBase {
    @Test
    void successRegistrationFormTest() {


        RegistrationPage registrationPage = new RegistrationPage();

        registrationPage.openPage()
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

        registrationPage.checkResultTableVisible("Thanks for submitting the form")
                .checkResult(firstName)
                .checkResult(lastName)
                .checkResult(email)
                .checkResult(phone);

    }
}
