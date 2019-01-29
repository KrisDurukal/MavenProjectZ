package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import javafx.scene.web.WebView;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingPage
{
    public ListingPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "asdaafasd")
    public WebElement adress;

    @FindBy(xpath = "asdaafasd")
    public WebElement agent;

    @FindBy(xpath = "asdaafasd")
    public WebElement map;
}
