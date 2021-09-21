package com.cybertek.test1.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class GooglePractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("Firefox");
        driver.get("https://www.google.com/");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("Belgium Venture Capital Firms Investing in Africa");
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        List<WebElement> titles= driver.findElements(By.xpath("//div[@class='yuRUbf']/a"));
        System.out.println(titles.size());
        for(WebElement e:titles){
            System.out.println(e.getAttribute("href"));
            System.out.println("Hey I am in the loop");
            Thread.sleep(2000);
            driver.get(e.getAttribute("href"));
            WebElement contactPage=driver.findElement(By.partialLinkText("contact"));
            contactPage.click();
            Thread.sleep(2000);

        }
        driver.quit();
    }
}
