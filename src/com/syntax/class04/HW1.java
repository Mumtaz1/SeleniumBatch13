package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    Enter valid username and password (username - Admin, password - Hum@nhrm123)
    Click on login button
    Then verify Syntax Logo is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Launch the browser
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.cssSelector("input[id = 'txtUsername']")); //or input#id
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input[id = 'txtPassword']")); //or input#id
        password.sendKeys("Hum@hrm123");

        WebElement loginButton = driver.findElement(By.cssSelector("input[class = 'button']")); //or input.button
        loginButton.click();

        WebElement syntaxLogo = driver.findElement(By.cssSelector("input[value = '5 - 15']"));  //change this
        boolean isSyntaxLogoDisplayed = syntaxLogo.isDisplayed();
        System.out.println(isSyntaxLogoDisplayed);

        driver.quit();
    }
}