package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PrestashopHomePage
{
    public PrestashopHomePage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Sign in")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]")
    public WebElement blouse;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
    public WebElement blouseAdd;

    @FindBy(linkText = "http://automationpractice.com/index.php?controller=order")
    public WebElement proceedToCheckout;

    public WebElement products(String productName)
    {
        String xpath = "(//h5/a[@atitle='" + productName + "'])[1]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public void open()
    {
        Driver.getDriver().get(" http://automationpractice.com/index.php");
    }

    public void implicitlyWait()
    {
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

//    public void switchIFrame()
//    {
//        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("fancybox-frame1548379423934")));
//    }
}
