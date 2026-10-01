package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://captainhook07.github.io/gradleproject/");

            System.out.println("Title: " + driver.getTitle());

            String heading = driver.findElement(
                    By.tagName("h1")
            ).getText();

            System.out.println("Heading: " + heading);

        } finally {
            driver.quit();
        }
    }
}