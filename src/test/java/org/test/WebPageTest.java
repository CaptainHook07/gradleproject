package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebPageTest {

    private WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://captainhook07.github.io/gradleproject/");
    }

    @Test
    public void titleValidationTest() {

        String actualTitle = driver.getTitle();

        System.out.println("Actual Title: " + actualTitle);

        Assert.assertEquals(
                actualTitle,
                "BeginnerHub",
                "Page title is incorrect"
        );
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}