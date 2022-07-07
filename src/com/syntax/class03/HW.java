package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {

    /*
    Navigate to http://syntaxprojects.com
    Click on start practicing
    Click on simple form demo
    Enter any text on first text box
    Click on show message
    Quit the browser
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Launch the browser
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();

        WebElement startPractising = driver.findElement(By.xpath("//a[@id = 'btn_basic_example']"));
        startPractising.click();

        Thread.sleep(2000);
        WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text() = 'Simple Form Demo']/parent::div"));
        simpleFormDemo.click();

        WebElement enterMessage = driver.findElement(By.xpath("//input[@id = 'user-message']"));
        enterMessage.sendKeys("Good morning!");

        WebElement showMessage = driver.findElement(By.xpath("//button[text() = 'Show Message']"));
        showMessage.click();

        driver.quit();

    }
}
