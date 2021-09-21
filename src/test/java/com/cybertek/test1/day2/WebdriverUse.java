package com.cybertek.test1.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.*;
import java.util.List;

public class WebdriverUse {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        driver.get("https://google.com");
        File myFile=new File("/home/yasin/IdeaProjects/EU6TEstNG/src/test/java/com/cybertek/test1/day2/myTestResults.txt");
        FileWriter writer=new FileWriter(myFile);
        WebElement searchbox= driver.findElement(By.tagName("input"));
        searchbox.sendKeys("reddit");
        driver.findElement(By.name("btnK")).click();
        List<WebElement> titles= driver.findElements(By.className("yuRUbf"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys("t").build().perform();
        for (WebElement e: titles){
            writer.write(e.findElement(By.xpath("./a")).getAttribute("href"));
            System.out.println("Success");
        }
        writer.close();
    }
}
