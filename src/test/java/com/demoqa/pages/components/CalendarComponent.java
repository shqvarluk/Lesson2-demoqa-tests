package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    SelenideElement monthSelector =
            $(".react-datepicker__month-select"),
            yearSelector = $(".react-datepicker__year-select");

    private CalendarComponent setMonth(String month) {
        monthSelector.selectOption(month);
        return this;
    }

    private CalendarComponent setYear(String year) {
        yearSelector.selectOption(year);
        return this;
    }

    private CalendarComponent setDay(String day) {
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
        return this;
    }

    public CalendarComponent setDateUpd(String month, String year, String day) {
        setMonth(month);
        setYear(year);
        setDay(day);
        return this;
    }
}
