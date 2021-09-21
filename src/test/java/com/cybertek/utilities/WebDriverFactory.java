package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType){
        browserType=browserType.toLowerCase();
        switch(browserType){
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                WebDriver firefoxDriver=new FirefoxDriver();
                return firefoxDriver;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                WebDriver driver=new ChromeDriver();
                return driver;
        }
        return null;
    }
}
