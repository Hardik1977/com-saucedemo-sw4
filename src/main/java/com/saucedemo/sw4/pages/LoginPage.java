package com.saucedemo.sw4.pages;

import com.saucedemo.sw4.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userName = By.id("user-name");  //Finding Web element and storing in variable

    By password = By.name("password"); //Finding Web element and storing in variable

    By clickButton = By.name("login-button");  //Finding Web element and storing in variable


    public void clickOnUserNameField(String userID) {
        sendTextToElement(userName, userID);    //Finding Element for username and sending text to username field
    }

    public void clickOnPasswordField(String password1) {
        sendTextToElement(password, password1);   //Finding Element for password and sending text to password field
    }


    public void clickOnLoginButton() {
        clickOnElement(clickButton);      //click on login button and perform click}
    }
}