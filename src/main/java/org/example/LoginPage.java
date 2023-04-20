package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage
{
    WebDriver driver;
    By username = By.id("user-name");
    By pass = By.id("password");
    By login =By.id("login-button");
    public LoginPage(WebDriver driver ){
        this.driver=driver;
    }
    public void enterUsername(String uname){
        driver.findElement(username).sendKeys(uname);
    }
    public void enterPassword(String upass){
        driver.findElement(pass).sendKeys(upass);

    }
    public void loginButton(){
        driver.findElement(login).click();

    }
}
