/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumwebautomation;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
public class CreateAccountPage {

    WebDriver driver;

    @FindBy(how = How.NAME, using = "fp-input-first_name")
    @CacheLookup
    private WebElement fname;

    @FindBy(how = How.XPATH, using = "//input[@name='fp-input-last_name']")
    @CacheLookup
    private WebElement lname;

    @FindBy(how = How.XPATH, using = "//input[@name='fp-input-email']")
    @CacheLookup
    private WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@name='reenter-email']")
    @CacheLookup
    private WebElement re_email;

    @FindBy(how = How.XPATH, using = "//input[@name='fp-input-password']")
    @CacheLookup
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//input[@name='re-password']")
    @CacheLookup
    private WebElement re_password;

    @FindBy(how = How.XPATH, using = "//div[@class='fp-dropdown fp-dropdown-store fp-has-value']")
    @CacheLookup
    private WebElement dd;

    @FindBy(how = How.XPATH, using = "//span[@class='fp-dropdown-menu']//ul[@class='fp-dropdown-list']//li//a[contains(text(), 'IL - Prospect')]")
    private WebElement storelist;

    @FindBy(how = How.XPATH, using = "//div[@data-role='dropdown-month']")
    private WebElement monthdd;

    @FindBy(how = How.XPATH, using = "//div[@data-role='dropdown-month']//li//a[contains(text(), 'Nov (11)')]")
    private WebElement month;

    @FindBy(how = How.NAME, using = "fp-input-date_of_birth_day")
    private WebElement day;

    @FindBy(how = How.XPATH, using = "//div[@data-role='dropdown-year']")
    private WebElement yeardd;

    @FindBy(how = How.XPATH, using = "//div[@data-role='dropdown-year']//li//a[contains(text(), '1992')]")
    private WebElement year;

    @FindBy(how = How.NAME, using = "fp-input-address_1")
    private WebElement add1;

    @FindBy(how = How.NAME, using = "fp-input-city")
    private WebElement city;

    @FindBy(how = How.XPATH, using = "//div[@data-role='region']")
    private WebElement regiondd;

    @FindBy(how = How.XPATH, using = "//div[@data-role='region']//li//a[contains(text(),'Illinois')]")
    private WebElement region;

    @FindBy(how = How.NAME, using = "fp-input-postal_code")
    private WebElement postalcode;

    @FindBy(how = How.NAME, using = "fp-input-phone")
    private WebElement phone;

    @FindBy(how = How.XPATH, using = "//div[@class='account-login']//a[contains(text(),'Sign In')]")
    private WebElement sign_in;

    public CreateAccountPage(WebDriver driver1) {
        this.driver = driver1;
    }

    public void onCreateAccountPage(String first, String last, String emailM, String re_emailM, String passwordM, String re_passwordM, String date, String address, String cityname, String zip, String ph)
            throws Exception {

        fname.sendKeys(first);
        lname.sendKeys(last);
        email.sendKeys(emailM);
        re_email.sendKeys(re_emailM);
        Thread.sleep(2000);
        password.sendKeys(passwordM);
        re_password.sendKeys(re_passwordM);
        Thread.sleep(1000);
        dd.click();
        storelist.click();
        Thread.sleep(1500);
        monthdd.click();
        month.click();
        day.sendKeys(date);
        yeardd.click();
        year.click();
        add1.sendKeys(address);
        city.sendKeys(cityname);
        Thread.sleep(1000);
        regiondd.click();
        region.click();
        postalcode.sendKeys(zip);
        phone.sendKeys(ph);
        sign_in.click();
    }
}
