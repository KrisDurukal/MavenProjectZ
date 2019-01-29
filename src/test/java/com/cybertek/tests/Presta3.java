package com.cybertek.tests;

import com.cybertek.pages.PrestashopHomePage;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Presta3 extends PrestashopHomePage
{
    @Test
    public void presta()
    {
        PrestashopHomePage prestaHome = new PrestashopHomePage();
        prestaHome.implicitlyWait();
        prestaHome.open();
        prestaHome.blouse.click();
        prestaHome.blouseAdd.click();
    }
}
