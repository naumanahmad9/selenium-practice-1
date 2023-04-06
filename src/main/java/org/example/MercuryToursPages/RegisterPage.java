package org.example.MercuryToursPages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterPage {
    WebDriver driver;
    By firstNameField = By.name("firstName");
    By lastNameField = By.name("lastName");
    By phoneField = By.name("phone");
    By emailField = By.name("userName");
    By addressField = By.name("address1");
    By cityField = By.name("city");
    By stateField = By.name("state");
    By postalCodeField = By.name("postalCode");
    By countryDropdown = By.name("country");
    By usernameField = By.name("email");
    By passwordField = By.name("password");
    By confirmPasswordField = By.name("confirmPassword");
    By formSubmitButton = By.name("submit");

    public void validateRegistrationForm(){
        // firstName, lastName, phone, email, address, city, state, postalCode, password

        // Test Data
        String firstName =  RandomStringUtils.randomAlphabetic(8);
        String lastName = RandomStringUtils.randomAlphabetic(8);
        String phone = "021-225-55566";
        String email = firstName+"@abc.com";
        String address = RandomStringUtils.randomAlphabetic(8);
        String city = "city";
        String state = "state";
        String postalCode = "123456";
        String password = RandomStringUtils.randomAlphabetic(8);

        String expectedUserName = "Dear "+firstName+" "+lastName+",";

        String registerPageTitle = driver.getTitle();
        String expectedPageTile = "Register: Mercury Tours";
        Assert.assertEquals(registerPageTitle,expectedPageTile);

        WebElement firstNameTextBox = driver.findElement(firstNameField);
        firstNameTextBox.sendKeys(firstName);

        WebElement lastNameTextBox = driver.findElement(lastNameField);
        lastNameTextBox.sendKeys(lastName);

        WebElement phoneTextBox = driver.findElement(phoneField);
        phoneTextBox.sendKeys(phone);

        WebElement emailTextBox = driver.findElement(emailField);
        emailTextBox.sendKeys(email);

        WebElement addressTextBox = driver.findElement(addressField);
        addressTextBox.sendKeys(address);

        WebElement cityTextBox = driver.findElement(cityField);
        cityTextBox.sendKeys(city);

        WebElement stateTextBox = driver.findElement(stateField);
        stateTextBox.sendKeys(state);

        WebElement postalCodeTextBox = driver.findElement(postalCodeField);
        postalCodeTextBox.sendKeys(postalCode);

        Select countryDropDown = new Select(driver.findElement(countryDropdown));
        countryDropDown.selectByValue("ANGOLA");

        WebElement userNameTextBox = driver.findElement(usernameField);
        userNameTextBox.sendKeys(email);

        WebElement passwordTextBox = driver.findElement(passwordField);
        passwordTextBox.sendKeys(password);

        WebElement confirmPasswordTextBox = driver.findElement(confirmPasswordField);
        confirmPasswordTextBox.sendKeys(password);

        WebElement submitButton = driver.findElement(formSubmitButton);
        submitButton.click();
    }
}
