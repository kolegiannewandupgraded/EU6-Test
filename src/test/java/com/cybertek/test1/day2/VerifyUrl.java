package com.cybertek.test1.day2;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrl {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("Firefox");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String url=driver.getCurrentUrl();
        WebElement newPassword= driver.findElement(By.id("form_submit"));
        Faker fake=new Faker();
        WebElement inputBox=driver.findElement(By.tagName("input"));
        inputBox.sendKeys(fake.internet().emailAddress());
        String valueOfInbox=inputBox.getAttribute("value");
        System.out.println(valueOfInbox);
        newPassword.click();

        String newUrl=driver.getCurrentUrl();
        System.out.println(url.equals(newUrl));
        driver.close();
    }
}
