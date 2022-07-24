package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropDown {

    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        Thread.sleep(2000);
        WebElement daysDD = driver.findElement(By.id("select-demo")); //identifying the dropdown as a single element
        Select select = new Select(daysDD); //create an object of Select class for this specific WebElement

     /*
        select.selectByIndex(3); //clicks on Tuesday

        Thread.sleep(2000); //sleep for 2 seconds
        select.selectByVisibleText("Thursday"); //clicks on Monday

        Thread.sleep(2000);
        select.selectByValue("Friday");

        */

        List<WebElement> allOptions = select.getOptions();
        int size = allOptions.size();
        System.out.println(size);  //8

        for(int i = 1; i < size; i ++) {
            String option = allOptions.get(i).getText();
            System.out.println(option);
            select.selectByIndex(i);
            Thread.sleep(1000);
        }
    }
}