/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumwebautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author saiye
 */
public class WelcomePage {
    WebDriver driver;

    public WelcomePage(WebDriver driver1) {
        this.driver=driver1;
    }

    @FindBy(xpath = "//img[@alt='Close']")
    @CacheLookup
    private WebElement welcome;
    
    public void closewelcomemessage()
            throws Exception {
            driver.get("https://www.tonysfreshmarket.com/");
            driver.manage().window().maximize();
            welcome.click();
    }
    
}
