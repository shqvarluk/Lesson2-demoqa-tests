package com.demoqa.utils;

import com.github.javafaker.Faker;

import static com.demoqa.utils.TestDataMethods.*;

public class TestDateProperties {
    static Faker faker = new Faker();

    public static String firstName = getRandomFirstName(),
            lastName = getRandomLastName(),
            email = getRandomEmail(),
            gender = getRandomGender(),
            phone = getRandomPhone(),
            day = getRandomDay(),
            month = getRandomMonth(),
            year = getRandomYear(),
            subject = getRandomSubject(),
            hobie = getRandomHobie(),
            picture = "img/1.png",
            address = getRandomAddress(),
            state = getRandomState(),
            city = getRandomCity(state);
}
