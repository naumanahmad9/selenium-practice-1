package org.example.MercuryToursPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DashboardPage {
    WebDriver driver;
    By loginSuccessMessage = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3");
    By registrationSuccessMessage = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font");

    public void validateLoginSuccess() {
        WebElement successMessage = driver.findElement(loginSuccessMessage);
        String successMessageText = successMessage.getText();
        String expectedMessageText = "Login Successfully";
        Assert.assertEquals(successMessageText, expectedMessageText);
    }

    public void validateRegistrationSuccess() {
        WebElement successMessage = driver.findElement(registrationSuccessMessage);
        String successMessageText = successMessage.getText().substring(0,26);
        String expectedMessageText = "Thank you for registering";
        Assert.assertEquals(successMessageText, expectedMessageText);
    }
}
