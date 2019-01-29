package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CraigslistTest {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://washingtondc.craigslist.org/");

//        driver.findElement(By.name("query")).sendKeys("corolla");
//        driver.findElement(By.linkText("electronics")).click();
        driver.findElement(By.partialLinkText("+garden")).click();

    }
}
