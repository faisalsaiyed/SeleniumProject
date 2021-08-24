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
public class SignOutPage {

    WebDriver driver;

    public SignOutPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Sign Out') and @class='fp-logout-link']")
    private WebElement signOut;

    public void SignOutPage() throws Exception {

        signOut.click();

    }
}
