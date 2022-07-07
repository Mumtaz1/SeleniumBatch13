package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

    public static void main(String[] args) {

        //1. Set a system property to use chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //2. Create an object of webdriver type
        WebDriver driver = new ChromeDriver(); //Launch the browser
        //3. Navigate to desired URL
        driver.get("https://www.fb.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String expectedTitle = "Facebook - log in or sign up";
        if(title.equals(expectedTitle)) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is Not Correct");
        }
        driver.quit();
    }
}
