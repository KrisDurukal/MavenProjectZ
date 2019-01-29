package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievePassword {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/cybertekschool/Documents/selenium dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/forgot_password");

        WebElement email = driver.findElement(By.tagName("input"));

        email.sendKeys("example@gmail.com");

        WebElement button = driver.findElement(By.tagName("button"));

        button.click();
    }
}
