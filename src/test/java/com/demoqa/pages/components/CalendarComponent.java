package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CalendarComponent {

    SelenideElement monthSelector = $(".react-datepicker__month-select"),
            yearSelector = $(".react-datepicker__year-select");
    public void setDate(String day, String month, String year) {
        monthSelector.selectOption(month);
        yearSelector.selectOption(year);
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
    }
}
