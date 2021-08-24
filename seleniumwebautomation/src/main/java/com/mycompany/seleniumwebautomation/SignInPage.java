/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumwebautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 *
 * @author saiye
 */
public class SignInPage {
    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.NAME, using = "fp-input-email")
    WebElement userName;

    @FindBy(how = How.NAME, using = "fp-input-password")
    WebElement password;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign In')]")
    WebElement submitBtn;

    public void loginToSignin(String uName, String pWord)
            throws Exception {

            Thread.sleep(1500);
            userName.sendKeys(uName);
            password.sendKeys(pWord);
            submitBtn.click();
    }
}
