package com.saucedemo.sw4.testsuite;

import com.saucedemo.sw4.pages.LoginPage;
import com.saucedemo.sw4.pages.ProductPage;
import com.saucedemo.sw4.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    ProductPage product = new ProductPage();



    @Test
    public void userSholdLoginSuccessfullyWithValid() {
        loginPage.clickOnUserNameField("standard_user");
        loginPage.clickOnPasswordField("secret_sauce");
        loginPage.clickOnLoginButton();

        Assert.assertEquals(product.productPageTitle(),"Products");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.clickOnUserNameField("standard_user");
        loginPage.clickOnPasswordField("secret_sauce");
        loginPage.clickOnLoginButton();
        //Verifying the actual and expected text
        Assert.assertEquals(product.verifyThatSixProductsAreDisplayedOnPage(),6);


    }
}