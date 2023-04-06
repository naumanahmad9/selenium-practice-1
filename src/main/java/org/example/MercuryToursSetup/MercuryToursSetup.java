package org.example.MercuryToursSetup;

import org.example.MercuryToursPages.DashboardPage;
import org.example.MercuryToursPages.HomePage;
import org.example.MercuryToursPages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MercuryToursSetup {
    WebDriver driver;

    HomePage homePage;
    DashboardPage dashboardPage;
    RegisterPage registerPage;
    String homePageUrl = "https://demo.guru99.com/test/newtours";

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get(homePageUrl);
    }

    // Navigate to Homepage
    @Test(priority = 1)
    public void navigateToHomepage() {
        homePage = new HomePage();
        // Verify the title of the page
        homePage.validateMercuryPageTitle();
    }
    // Login test
    @Test(priority = 2)
    public void loginTest() {
        // verify the login form
        homePage.validateLoginForm();
        // verify the login success
        dashboardPage.validateLoginSuccess();
    }

    @Test(
            groups = "Functional",
            description = "To verify the registration of new user"
    )
    public void registrationTest() {

        driver.get(homePageUrl);

        // verify the registration form
        registerPage.validateRegistrationForm();
        // verify the registration success message
        dashboardPage.validateRegistrationSuccess();
    }
}
