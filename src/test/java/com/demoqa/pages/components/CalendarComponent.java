package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    SelenideElement

            monthSelector = $(".react-datepicker__month-select"),
            yearSelector = $(".react-datepicker__year-select");

    private void setMonth(String month) {
        monthSelector.selectOption(month);
    }

    private void setYear(String year) {
        yearSelector.selectOption(year);
    }

    private void setDay(String day) {
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
    }

    public CalendarComponent setDateUpd(String day, String month, String year) {
        setMonth(month);
        setYear(year);
        setDay(day);
        return this;
    }
}
