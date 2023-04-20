package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest
{
    WebDriver driver;
    @Test
    public void loginVerification(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();


        LoginPage login=new LoginPage(driver);
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.loginButton();
        driver.quit();
    }
}
