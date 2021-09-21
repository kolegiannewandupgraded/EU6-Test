package com.cybertek.test1.day4_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("Firefox");
        driver.get("http://practice.cybertekschool.com/sign_up");

    }
}
