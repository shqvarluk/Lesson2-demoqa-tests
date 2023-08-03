package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class RegistrationFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successRegistrationFormTest() {
        registrationPage.openPage()
                .setFirstName("Ivanov")
                .setLastName("Ivan")
                .setEmail("Ivan@m.ru")
                .setGender("Other")
                .setUserNumber("0123456789")
                .setDateBirth("30", "July", "1998")
                .setSubject("Math")
                .setHobbies("Sports")
                .setPicture("img/1.png")
                .setAddress("address")
                .setState("NCR")
                .setCty("Delhi")
                .saveProfile();

        registrationPage.checkResultTableVisible("Thanks for submitting the form")
                .checkResult("Ivanov")
                .checkResult("Ivan")
                .checkResult("Ivan@m.ru")
                .checkResult("0123456789");

    }

    @Test
    void successRegistrationFormMinimalTest() {
        registrationPage.openPage()
                .setFirstName("Petrov")
                .setLastName("Petr")
                .setEmail("petrov@bk.ru")
                .setGender("Male")
                .setUserNumber("9876543210")
                .setDateBirth("29", "December", "2000")
                .saveProfile();

        registrationPage.checkResultTableVisible("Thanks for submitting the form")
                .checkResult("Petrov")
                .checkResult("Petr")
                .checkResult("petrov@bk.ru")
                .checkResult("9876543210");


    }
}
