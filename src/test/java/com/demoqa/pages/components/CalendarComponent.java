package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CalendarComponent {

    SelenideElement


            monthSelector = $x("//*[@class='react-datepicker__month-select']"),
            yearSelector = $(".react-datepicker__year-select");

    public void setMonth(String month) {
        monthSelector.selectOption(month);
    }

    private void setYear(String year) {
        yearSelector.selectOption(year);
    }

    private void setDay(String day) {
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
    }

    public void setDateUpd(String day, String month, String year) {
        setMonth(month);
        setYear(year);
        setDay(day);
    }
}
