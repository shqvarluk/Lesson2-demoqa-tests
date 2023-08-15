package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;

import static com.demoqa.utils.TestDateProperties.*;

public class TestDataMethods {
    private static final String[] GENDERS =  {"Male", "Female", "Other"};
    private static final String[] MONTHS =  {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    private static final String[] SUBJECTS =  {"Accounting", "Arts", "Biology", "Chemistry", "Civics", "Economics",
            "English", "Commerce", "Computer Science", "Physics", "Maths", "Hindi", "History", "Social Studies"};
    private static final String[] HOBBIES =  {"Sports", "Reading", "Music"};
    private static final String[] STATES =  {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

    public static String getRandomArrayItem(String[] array) {
        return new Faker().options().option(array);
    }

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
        return getRandomArrayItem(GENDERS);
    }

    public static String getRandomPhone() {
        return faker.numerify("###########");
    }

    public static String getRandomMonth() {
        return getRandomArrayItem(MONTHS);
    }

    public static String getRandomYear() {
        return new Faker().random().nextInt(1980, 2001).toString();
    }

    public static String getRandomDay() {
        return new SimpleDateFormat("dd").format(new Faker().random().nextInt(1, 28).toString());
    }

    public static String getRandomSubject() {
        return getRandomArrayItem(SUBJECTS);
    }

    public static String getRandomHobie() {
        return getRandomArrayItem(HOBBIES);
    }

    public static String getRandomAddress() {
        return faker.address().fullAddress();
    }

    public static String getRandomState() {
        return getRandomArrayItem(STATES);
    }


    public static String getRandomCity(String state) {
        String[] cities;
        switch (state) {
            case  ("NCR"):
                cities = new String[]{"Delhi", "Gurgaon", "Noida"};
                return getRandomArrayItem(cities);
            case ("Uttar Pradesh"):
                cities = new String[]{"Agra", "Lucknow", "Merrut"};
                return getRandomArrayItem(cities);
            case ("Haryana"):
                cities = new String[]{"Karnal", "Panipat"};
                return getRandomArrayItem(cities);
            case ("Rajasthan"):
                cities = new String[]{"Jaipur", "Jaiselmer"};
                return getRandomArrayItem(cities);
        }
        return null;
    }

}
