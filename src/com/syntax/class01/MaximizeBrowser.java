package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

    public static void main(String[] args) {

        //1. Set a system property to use chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //2. Create an object of webdriver type
        WebDriver driver = new ChromeDriver(); //Launch the browser
        //3. Navigate to desired URL
        driver.navigate().to("https://www.amazon.com");
        // driver.manage() .window().maximize(); //maximizes window
        driver.manage().window().fullscreen(); //we don't have navigation bar, tabs, or bookmarks
    }
}
