package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrdersTask {

    public static void main(String[] args) {

        /*
        Task:
        Navigate to: http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
        Login
        Get title and verify
        logout
        close the browser
         */

        //1. Set a system property to use chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //2. Create an object of webdriver type
        WebDriver driver = new ChromeDriver(); //Launch the browser
        //3. Navigate to desired URL
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

        String title = driver.getTitle();
        String expectedTitle = "Web Orders";
        if(title.equals(expectedTitle)){
            System.out.println("Title is Correct");
        }else {
            System.out.println("Title is Not correct");
        }

        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}
