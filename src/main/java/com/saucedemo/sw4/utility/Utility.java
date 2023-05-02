package com.saucedemo.sw4.utility;

import com.saucedemo.sw4.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Utility extends ManageBrowser {
    public void clickOnElement(By by) {

        driver.findElement(by).click();                            //Method to find button Element and click
    }

    public void sendTextToElement(By by, String text) {

        driver.findElement(by).sendKeys(text);                     //Method to find Element and send text
    }

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();                   //Method to find Element and get text from webpage
    }

    public void printNameOfProduct(By by) {

        List<WebElement> lst = driver.findElements(by);             //Find element and create a list
        for (int i = 0; i < lst.size(); i++) {                      //For loop to count
            System.out.println(lst.get(i).getText());                 //Get text from webpage and print it in console

        }
    }

    /**
     * //List of images to check on webpage
     *
     * @param by
     */
    public int countTheProduct(By by) {
        return driver.findElements(by).size();              //Find the element and count how many
                                                          //Print the total number of images in console
    }
}


