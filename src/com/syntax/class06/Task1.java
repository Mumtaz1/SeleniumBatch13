package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    /*
    Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    Verify the header text Sorry, We Couldn't Find Anything For
    "Asksn" is displayed
    Verify enroll today button is enabled
     */

    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        driver.switchTo().frame("FrameOne");
        WebElement heading = driver.findElement(By.xpath("//h1[@class='heading-13']"));
        heading.isDisplayed();
        boolean displayMsg = heading.isDisplayed();
        System.out.println("Is the text (Sorry, We Couldn't Find Anything For Asksn) displayed? " + displayMsg);


        driver.switchTo().defaultContent();
        driver.switchTo().frame("FrameTwo");
        WebElement enrollButtonDisplayed = driver.findElement(By.xpath("//div[@class='text-block-2']"));
        enrollButtonDisplayed.isDisplayed();
        boolean verify = enrollButtonDisplayed.isEnabled();
        System.out.println("Is the enroll button enabled? " + verify);


    }
}
