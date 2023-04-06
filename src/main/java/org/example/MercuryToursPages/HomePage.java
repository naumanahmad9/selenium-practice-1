package org.example.MercuryToursPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;
    By userNameField = By.name("userName");
    By passwordField = By.name("password");
    By loginSubmitButton = By.name("submit");
    By registrationPageLink = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]");

    // Validate page title
    public void validateMercuryPageTitle(){
        String actualMercuryPageTile = driver.getTitle();
        String expectedMercuryPageTitle = "Welcome: Mercury Tours";

        Assert.assertEquals(actualMercuryPageTile,expectedMercuryPageTitle);
    }

    // Validate login
    public void validateLoginForm(){

        WebElement userNameTextField = driver.findElement(userNameField);
        userNameTextField.sendKeys("test");
        WebElement passwordTextField = driver.findElement(passwordField);
        passwordTextField.sendKeys("test");
        WebElement submitButton = driver.findElement(loginSubmitButton);
        submitButton.click();
    }

    // Navigate to registration page
    public void navigateToRegisterPage() {
        WebElement registerLink = driver.findElement(registrationPageLink);
        registerLink.click();
    }
}
