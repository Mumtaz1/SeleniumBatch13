package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        //1. Set a system property to use chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //2. Create an object of webdriver type
        WebDriver driver = new ChromeDriver(); //Launch the browser
        //3. Navigate to desired URL
        driver.get("https://www.facebook.com");
        driver.navigate().to("http://www.google.com");
        driver.navigate().back(); //navigates back to facebook
        driver.navigate().forward();
        Thread.sleep(2000);   // pause execution for 2 secs
        driver.navigate().refresh();

  //    driver.close();  //closes the current tab
        driver.quit();  //closes the whole browser (all tabs)

    }
}
