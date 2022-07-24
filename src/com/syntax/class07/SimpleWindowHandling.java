package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.x509.InvalidityDateExtension;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {

    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle(); //get window handle for the main page
        System.out.println(mainPageHandle);

        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();

        //need all tab  id on hand
        driver.getWindowHandles();
        Set<String> allWindowHandles = driver.getWindowHandles(); //store all the handles inside the Set
        System.out.println(allWindowHandles.size());

        Iterator<String> it = allWindowHandles.iterator(); //have an iterator in order to iterate through the handles
        mainPageHandle = it.next(); //take 1st step and assign the main page handle
        String childHandle = it.next(); //take 2nd step and have a child handle
        System.out.println(childHandle);

        Thread.sleep(2000);
        driver.switchTo().window(childHandle);
        driver.close();  //it closed main (Parent) page b/c we didn't have line 37 b4
        driver.switchTo().window(mainPageHandle); //switches focus to main page window
        helpLink.click();

        driver.quit();



    }
}