package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1Facebook {

    /*
    Go to Facebook Sign Up Page
    Fill out the whole form
    Click Signup
     */

    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement loginButton = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
        loginButton.click();

        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("First");
        driver.findElement(By.name("lastname")).sendKeys("Last");
        driver.findElement(By.name("reg_email__")).sendKeys("email");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password");

        WebElement selectMonth = driver.findElement(By.id("month"));
        Select month = new Select(selectMonth);
        month.selectByVisibleText("Aug");

        WebElement selectDay = driver.findElement(By.id("day"));
        Select day = new Select(selectDay);
        day.selectByValue("15");

        WebElement selectYear = driver.findElement(By.id("year"));
        Select year = new Select(selectYear);
        year.selectByValue("2005");

        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.findElement(By.name("websubmit")).submit();

        driver.quit();

    }
}