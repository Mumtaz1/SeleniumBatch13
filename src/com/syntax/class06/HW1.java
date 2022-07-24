package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    /*
    Go to https://syntaxprojects.com/javascript-alert-box-demo.php
    Click on each button and handle the alert accordingly
     */

    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        //Java Script Alert Box:
        WebElement buttonAlertBox = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        buttonAlertBox.click();
        //we need to switch the focus on the alert:
        Alert alertBox = driver.switchTo().alert(); //gives us an Alert object
        String alertText = alertBox.getText();
        System.out.println(alertText); //I am an alert box!
        alertBox.accept();  //gives us an Alert object
        Thread.sleep(2000);

        //Java Script Confirm Box:
        WebElement buttonConfirmBox = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        buttonConfirmBox.click();
        //we need to switch the focus on the alert:
        Alert confirmBox = driver.switchTo().alert(); //gives us an Alert object
        String confirmBoxText = confirmBox.getText();
        System.out.println(confirmBoxText); //Press a button!
        confirmBox.dismiss();  //dismisses the popup alert when we click Cancel.
        System.out.println(driver.findElement(By.id("confirm-demo")).getText()); //You pressed Cancel!

        //Java Script button for Prompt box
        WebElement buttonPromptBox = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        buttonPromptBox.click();
        //we need to switch the focus on the alert:
        Alert promptBox = driver.switchTo().alert(); //gives us an Alert object
        promptBox.sendKeys("Jane");
        System.out.println(promptBox.getText()); //Please enter your name
        promptBox.accept();
        System.out.println(driver.findElement(By.id("prompt-demo")).getText()); //You have entered 'Jane'!

    }
}