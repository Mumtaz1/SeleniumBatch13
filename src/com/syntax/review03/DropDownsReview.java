package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownsReview {

    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //     driver.manage().window().maximize();
        driver.get(url);

        Thread.sleep(2000);
        //Click on Create New Account button
        driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();

        Thread.sleep(2000);
        //select the Birth Day from the dropDown on the webPage
        WebElement dayDD = driver.findElement(By.xpath("//select[@id='day']"));

        //Select class to deal with drop down
        Select select = new Select(dayDD);
        List<WebElement> availableDays = select.getOptions();
        int size = availableDays.size();

   /*     for(WebElement day : availableDays) {
            System.out.println(day.getText());
        }   */

        //Select all options one-by-one by a difference of two seconds
   /*     for (int i = 0; i < size; i++) {
            System.out.println(availableDays.get(i).getText()) ;
            select.selectByIndex(i);
            Thread.sleep(2000);  */

        //Select by index the date 3
        select.selectByIndex(2);
        Thread.sleep(2000);

        //select by value the date 24
        select.selectByValue("24");
        Thread.sleep(2000);

        //select the option 7 by visible text
        select.selectByVisibleText("7");

        }
    }