package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {

    /*
    Go to https://demoqa.com/browser-windows
    Click on New Tab and print the text from new tab in the console
    Click on New Window and print the text from new window in the console
    Click on New Window Message and print the text from new window in the console
    Verify (compare) the titles for each page
    Print out the title of the all pages
     */

    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
 /*     System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();      */

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String mainPageHandle = driver.getWindowHandle();

        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();
        System.out.println(newTabButton.getText());

        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        newWindowButton.click();
        System.out.println(newWindowButton.getText());

        WebElement newWindowMsgButton = driver.findElement(By.id("messageWindowButton"));
        newWindowMsgButton.click();
        System.out.println(newWindowMsgButton.getText());

        Set<String> allWindowHandles = driver.getWindowHandles();

        Iterator<String> it = allWindowHandles.iterator();
        while (it.hasNext()) { //start iterating through the handles (tabs)
            String handle = it.next(); //get one handle from my set (tab)
            if (!mainPageHandle.equals(handle)) { //set a condition where main page is not equal to the handle
                driver.switchTo().window(handle); //switch to that specific handle (window)
                //driver.manage().window().maximize();
                String title = driver.getTitle(); //get the title
                if (title.isEmpty()) {
                    System.out.println("No title for this page");
                } else {
                    System.out.println(title);
                }
            }
        }
    }
}