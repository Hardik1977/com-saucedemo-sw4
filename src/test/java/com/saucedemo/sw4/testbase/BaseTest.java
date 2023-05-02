package com.saucedemo.sw4.testbase;

import com.saucedemo.sw4.propertyreader.PropertyReader;
import com.saucedemo.sw4.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");
    ;

    @BeforeMethod
    public void setup() {

        selectBrowser(browser);  //Open browser
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();  //Close browser
    }
}

