package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;

import static com.demoqa.utils.TestDateProperties.*;

public class TestDataMethods {

    public static String getRandomFirstName() {
        return faker.name().firstName();
    }

    public static String getRandomLastName() {
        return faker.name().lastName();
    }

    public static String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRandomGender() {
        String[] genders =  {"Male", "Female", "Other"};

        return new Faker().options().option(genders);
    }

    public static String getRandomPhone() {
        return faker.numerify("###########");
    }

    public static String getRandomMonth() {
        String[] months =  {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        return new Faker().options().option(months);
    }

    public static String getRandomYear() {
        return new Faker().random().nextInt(1980, 2001).toString();
    }

    public static String getRandomDay() {
        return new SimpleDateFormat("dd").format(new Faker().random().nextInt(1, 28).toString());
    }

    public static String getRandomSubject() {
        String[] subjects =  {"Accounting", "Arts", "Biology", "Chemistry", "Civics", "Economics",
                "English", "Commerce", "Computer Science", "Physics", "Maths", "Hindi", "History", "Social Studies"};

        return new Faker().options().option(subjects);
    }

    public static String getRandomHobie() {
        String[] hobbies =  {"Sports", "Reading", "Music"};

        return new Faker().options().option(hobbies);
    }

    public static String getRandomAddress() {
        return faker.address().fullAddress();
    }

    public static String getRandomState() {
        String[] states =  {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

        return new Faker().options().option(states);
    }

    public static String getRandomCity(String state) {
        String[] cities;
        switch (state) {
            case  ("NCR"):
                cities = new String[]{"Delhi", "Gurgaon", "Noida"};
                return new Faker().options().option(cities);
            case ("Uttar Pradesh"):
                cities = new String[]{"Agra", "Lucknow", "Merrut"};
                return new Faker().options().option(cities);
            case ("Haryana"):
                cities = new String[]{"Karnal", "Panipat"};
                return new Faker().options().option(cities);
            case ("Rajasthan"):
                cities = new String[]{"Jaipur", "Jaiselmer"};
                return new Faker().options().option(cities);
        }
        return null;
    }

}
