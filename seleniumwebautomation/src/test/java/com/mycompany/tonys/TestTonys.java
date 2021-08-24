/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tonys;

import com.mycompany.seleniumwebautomation.CreateAccountPage;
import com.mycompany.seleniumwebautomation.HomePage;
import com.mycompany.seleniumwebautomation.SignInPage;
import com.mycompany.seleniumwebautomation.SignOutPage;
import com.mycompany.seleniumwebautomation.WelcomePage;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author saiye
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestTonys {

    private static WebDriver driver;
    private String baseUrl;

    public TestTonys() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        
        
    }

    @AfterClass
    public static void tearDownClass() {
        driver.close();
    }

    @Before
    public void setUp() {
        
    }

    @After
    public void tearDown() {
    }
    
    
    
    @Test
    public void executeAWelcomePage() throws Exception {
        WelcomePage welcomepage = PageFactory.initElements(driver, WelcomePage.class);
        welcomepage.closewelcomemessage();
    }
    
    @Test
    public void executeBHomePage() throws Exception {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        Thread.sleep(2000);
        homepage.onHomePage();
        Thread.sleep(2000);
    }
    
    @Test
    public void executeCreateAccountPage() throws Exception {
        FileInputStream inputStream = new FileInputStream(new File("C:\\Data\\Tony's.xlsx"));
            Workbook workbook = new XSSFWorkbook(inputStream);

            Sheet firstSheet = workbook.getSheetAt(1);
            Row r = firstSheet.getRow(1);
            Cell c = r.getCell(1);  //username value

            String firstname = r.getCell(0).getStringCellValue();
            System.out.println(firstname);
            String lastname = r.getCell(1).getStringCellValue();
            System.out.println(lastname);
            String email = r.getCell(2).getStringCellValue();
            System.out.println(email);
            String re_email = r.getCell(3).getStringCellValue();
            System.out.println(re_email);
            String password = r.getCell(4).getStringCellValue();
            System.out.println(password);
            String re_password = r.getCell(5).getStringCellValue();
            System.out.println(re_password);
//            String store = r.getCell(6).getStringCellValue();
//            System.out.println(store);
//            String month = r.getCell(7).getStringCellValue();
//            System.out.println(month);
            String day = String.valueOf((int) r.getCell(8).getNumericCellValue());
            System.out.println(day);
//            String year = String.valueOf((int) r.getCell(9).getNumericCellValue());
//            System.out.println(year);
            String address1 = r.getCell(10).getStringCellValue();
            System.out.println(address1);
            String city = r.getCell(11).getStringCellValue();
            System.out.println(city);
//            String state = r.getCell(12).getStringCellValue();
//            System.out.println(state);
            String postal_code = String.valueOf((int) r.getCell(13).getNumericCellValue());
            System.out.println(postal_code);
            String phone = String.valueOf((long) r.getCell(14).getNumericCellValue());
            System.out.println(phone);
        
        CreateAccountPage capage = PageFactory.initElements(driver, CreateAccountPage.class);
        Thread.sleep(1000);
        capage.onCreateAccountPage(firstname, lastname, email, re_email, password, re_password, day, address1, city, postal_code, phone);
        //Thread.sleep(1000);
    }
    
    @Test
    public void executeDSignInClass() throws Exception {
     
        SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
        Thread.sleep(1000);
        loginpage.loginToSignin("nnilpatel.2000@gmail.com", "Nil@12345");
        Thread.sleep(2000);

    }
    
    @Test
    public void executeESignOutPage() throws Exception {
        SignOutPage signout = PageFactory.initElements(driver, SignOutPage.class);
        Thread.sleep(2000);
        signout.SignOutPage();
         Thread.sleep(2000);
        
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test  
    // public void hello() {}
}
