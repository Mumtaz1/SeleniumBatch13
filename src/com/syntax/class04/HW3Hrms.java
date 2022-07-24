package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW3Hrms {

    /*
    HRMS Application Negative Login:
    Open chrome browser
    Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    Enter valid username
    Leave password field empty
    Click on login button
    Verify error message with text "Password cannot be empty" is displayed.
     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    //    System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
    //    WebDriver driver = new FirefoxDriver(); //Launch the browser

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("");

        WebElement loginButton = driver.findElement(By.cssSelector("input.button"));
        loginButton.click();

        WebElement errorPasswordEmpty = driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));

        if (errorPasswordEmpty.isDisplayed()) {
            System.out.println("Password cannot be empty. Please provide a password");
        } else {
            System.out.println("A password was provided");
        }
        driver.quit();
    }
}
