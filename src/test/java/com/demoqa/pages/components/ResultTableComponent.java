package com.demoqa.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ResultTableComponent {

    SelenideElement stringFromTable = $(".table-responsive");

    public void checkResultString(String value) {
        stringFromTable.shouldHave(Condition.text(value));
    }
}
