package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

    public static void main(String[] args) throws InterruptedException {
        //1. Set a system property to use chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //2. Create an object of webdriver type
        WebDriver driver = new ChromeDriver(); //Launch the browser
        //3. Navigate to desired URL
        driver.get("https://www.fb.com");
        driver.findElement(By.id("email")).sendKeys("syntax@hlgl.com");
        driver.findElement(By.id("pass")).sendKeys("whatever");
        driver.findElement(By.name("login")).click();

        Thread.sleep(2000);
        //click on Forgot password link
     //   driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();
    }
}
