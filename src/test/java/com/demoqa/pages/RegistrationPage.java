package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.ResultTableComponent;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    ResultTableComponent resultTableComponent = new ResultTableComponent();
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            pictureButton = $("#uploadPicture"),
            currentAddressTextarea = $("#currentAddress"),
            stateSelector = $("#state"),
            stateCityWrapper = $("#stateCity-wrapper"),
            citySelector = $("#city"),
            saveButton = $("#submit"),
            resultModal = $(".modal-dialog");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        return this;
    }

    public RegistrationPage closeBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public RegistrationPage setGender(String gender) {
        genderWrapper.$(byText(gender)).parent().click();
        return this;
    }

    public RegistrationPage setUserNumber(String number) {
        userNumberInput.setValue(number);
        return this;
    }

    public RegistrationPage setDateBirth(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDateUpd(day,month,year);
        return this;
    }

    public RegistrationPage setSubject(String subject) {
        subjectsInput.setValue(subject).pressEnter();
        return this;
    }
    public RegistrationPage setHobbies(String hobbies) {
        hobbiesWrapper.$(byText(hobbies)).click();
        return this;
    }

    public RegistrationPage setPicture(String path){
        pictureButton.uploadFromClasspath(path);
        return this;
    }

    public RegistrationPage setAddress(String address) {
        currentAddressTextarea.setValue(address);
        return this;
    }

    public RegistrationPage setState(String state) {
        stateSelector.click();
        stateCityWrapper.$(byText(state)).click();
        return this;
    }
    public RegistrationPage setCty(String city) {
        citySelector.click();
        stateCityWrapper.$(byText(city)).click();
        return this;
    }

    public void saveProfile() {
        saveButton.click();
    }

    public RegistrationPage checkResultTableVisible(String text) {
        resultModal.should(appear).shouldHave(text(text));
        return this;
    }

    public RegistrationPage checkResult (String value) {
        resultTableComponent.checkResultString(value);
        return this;
    }
}