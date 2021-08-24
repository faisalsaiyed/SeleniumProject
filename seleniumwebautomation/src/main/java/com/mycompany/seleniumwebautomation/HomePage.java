/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumwebautomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author saiye
 */
public class HomePage {

    WebDriver driver;
    
    @CacheLookup
    @FindAll({
    @FindBy(how = How.LINK_TEXT, using = "Create an Account"),
    @FindBy(how=How.XPATH, using = "//div//span[@class=\"fp-not-logged-in\"]//a[contains(text(),'Create an Account')]")    
    })
    private WebElement cacc;
    
    public HomePage(WebDriver driver1) {
        this.driver = driver1;
    }

    public void onHomePage() throws Exception {
            cacc.click();
    }

}
