package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {

        //1. Set a system property to use chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //2. Create an object of webdriver type
        WebDriver driver = new ChromeDriver(); //Launch the browser
        //3. Navigate to desired URL
        driver.get("https://www.google.com/");
        String url = driver.getCurrentUrl(); //get URL from browser
        System.out.println(url);
        String title = driver.getTitle(); //get Title
        System.out.println(title);
        driver.quit(); //to close the browser
    }
}
