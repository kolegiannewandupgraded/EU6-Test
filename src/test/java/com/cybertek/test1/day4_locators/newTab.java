package com.cybertek.test1.day4_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class newTab {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver driver= WebDriverFactory.getDriver("firefox");
        //driver.get("https://www.google.com");
        //driver.findElement(By.tagName("input")).sendKeys("reddit");
        //driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
        //Thread.sleep(2000);
        //WebElement link= driver.findElement(By.xpath("//div[@class='yuRUbf']/a"));
        //Actions action=new Actions(driver);
        //action.keyDown(Keys.CONTROL).click(link);
        //action.keyUp(Keys.CONTROL);
        //ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
        //driver.switchTo().window(list.get(1));
        ArrayList<Integer> myList=new ArrayList<>();
        myList.add(12); myList.add(54); myList.add(45);
        ArrayList<Integer> newList= myList.stream().map(item -> item*8).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(newList);
        //driver.get("http://www.yahoo.com/");
        //Thread.sleep(4000L);
        //driver.close();
    }

}
