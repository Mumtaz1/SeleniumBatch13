package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    1. Launch the browser
    2. Navigate to amazon web site
    3. Print out the title and the url in the console
    4. Close the browser
     */

    public static void main(String[] args) {
        //1. Set a system property to use chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //2. Create an object of webdriver type
        WebDriver driver = new ChromeDriver(); //Launch the browser
        //3. Navigate to desired URL
        driver.get("https://www.amazon.com/");
        String title = driver.getTitle(); //get Title
        String url = driver.getCurrentUrl();
        System.out.println(title + " " + url);
        driver.quit(); //to close the browser
    }
}
