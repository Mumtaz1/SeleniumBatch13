package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2Facebook {

    public static void main(String[] args) throws InterruptedException {

        /*
        Navigate to fb.com
        Click on Create new account
        Fill up all the textboxes
        Click on Sign up button
        Close the pop-up
        Close the browser
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Launch the browser
        driver.get("https://www.facebook.com");
        Thread.sleep(4000);

        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        Thread.sleep(4000);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("John");
        Thread.sleep(4000);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Doe");

        WebElement mobileOrEmail = driver.findElement(By.name("reg_email__"));
        mobileOrEmail.sendKeys("516-555-1212");

        WebElement newPwd = driver.findElement(By.id("password_step_input"));
        newPwd.sendKeys("new123pwd");

        WebElement birthMonth = driver.findElement(By.id("month"));
        birthMonth.sendKeys("Jun");

        WebElement birthDay = driver.findElement(By.id("day"));
        birthDay.sendKeys("24");

        WebElement birthYear = driver.findElement(By.id("year"));
        birthYear.sendKeys("2010");

        WebElement gender = driver.findElement(By.cssSelector("input._8esa[value='1']"));
        gender.click();
        Thread.sleep(4000);

        WebElement signUp = driver.findElement(By.name("websubmit"));
        signUp.click();

        WebElement closePopup = driver.findElement(By.cssSelector("img[src='https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png']"));
        closePopup.click();

        driver.close();

    }
}
