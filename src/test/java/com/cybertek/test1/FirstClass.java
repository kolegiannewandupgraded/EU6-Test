package com.cybertek.test1;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FirstClass {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        System.out.println(Arrays.toString(driver.getClass().getInterfaces()));

        //driver.get("https://eksisozluk.com/");


    }
}
