package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Parabank {

    public static void main(String[] args) {

        /*
        Navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        Fill out the form
        Click on Register
        Close the browser
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Launch the browser

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        //Note the below line is replaced with the 2 lines below it
        //driver.findElement(By.id("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22")).sendKeys("Jane");
        WebElement firstName = driver.findElement(By.id("customer.firstName")); //getting webelement in return
        firstName.sendKeys("Jane"); //performing action on the specific element

        WebElement lastName = driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Doe");

        WebElement address = driver.findElement(By.name("customer.address.street"));
        address.sendKeys("123 Apple St");

        WebElement city = driver.findElement(By.name("customer.address.city"));
        city.sendKeys("San Francisco");

        WebElement state = driver.findElement(By.name("customer.address.state"));
        state.sendKeys("CA");

        WebElement zipCode = driver.findElement(By.name("customer.address.zipCode"));
        zipCode.sendKeys("95432");

        WebElement phoneNum = driver.findElement(By.id("customer.phoneNumber"));
        phoneNum.sendKeys("123-555-1212");

        WebElement ssn = driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys("123-456-7890");

        WebElement userName = driver.findElement(By.id("customer.username"));
        userName.sendKeys("TestGuru");

        WebElement password = driver.findElement(By.name("customer.password"));
        password.sendKeys("password123");

        WebElement confirmPwd = driver.findElement(By.name("repeatedPassword"));
        confirmPwd.sendKeys("password123");

        driver.findElement(By.className("button")).click();

        driver.quit();
    }
}