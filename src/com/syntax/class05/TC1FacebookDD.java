package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC1FacebookDD {

    /*
    TC1: Facebook dropdown verification
    Open chrome browser
    Go to "https://www.facebook.com"
    Click on Create New Account
    Verify:
    Month dd has 12 month options
    day dd has 31 day options
    year dd has 115 year options
    Select your date of birth
    Quit browser
     */

    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement loginButton = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
        loginButton.click();

        //Month dropdown:
        Thread.sleep(2000); //sleep for 2 seconds
        WebElement selectMonth = driver.findElement(By.id("month"));
        Select month = new Select(selectMonth);
        List<WebElement> listMonth = month.getOptions();
        if (listMonth.size() == 12) {
            System.out.println("There are 12 options in the Month dropdown");
        } else {
            System.out.println("The Month dropdown does not have 12 month options");
        }

        WebElement selectDay = driver.findElement(By.id("day"));
        Select day = new Select(selectDay);
        List<WebElement> listDays = day.getOptions();
        if (listDays.size() == 31) {
            System.out.println("There are 31 options in the Day dropdown");
        } else {
            System.out.println("The Day dropdown does not have 31 day options");
        }

        WebElement selectYear = driver.findElement(By.id("year"));
        Select year = new Select(selectYear);
        List<WebElement> listYears = year.getOptions();
        if (listYears.size() == 115) {
            System.out.println("There are 118 options in the Year dropdown");
        } else {
            System.out.println("The Year dropdown has more than 115 options");
        }

        month.selectByVisibleText("Apr");
        day.selectByValue("11");
        year.selectByValue("2010");

        driver.quit();
    }
}