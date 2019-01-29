package com.cybertek.tests;

import com.cybertek.pages.HomePage;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidationTest extends TestBase
{

    @Test
    public void wrongEmailTest()
    {
        HomePage homePage = new HomePage();
        //driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        homePage.open();
        homePage.username.sendKeys("admin");
        homePage.password.sendKeys("test");
        homePage.loginButton.click();

        String actualError = homePage.errorMessage.getText();
        String error = "Invalid Login or Password.";
        Assert.assertEquals(actualError,error);
    }


    @Test
    public void wrongPasswordTest()
    {
        HomePage homePage = new HomePage();
        //driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        homePage.open();
        homePage.username.sendKeys("Tester");
        homePage.password.sendKeys("wrong password");
        homePage.loginButton.click();

        String actualError = homePage.errorMessage.getText();
        String error = "Invalid Login or Password.";
        Assert.assertEquals(actualError,error);
    }

    @Test
    public void blankUsername()
    {
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.login("","test");

        String expectedError = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError,expectedError);
    }
}
