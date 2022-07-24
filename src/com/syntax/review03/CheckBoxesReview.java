package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesReview {

    public static String url = "https://www.ironspider.ca/forms/checkradio.htm";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //     driver.manage().window().maximize();
        driver.get(url);

        //Get all the checkboxes in a list
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@name='color']"));

        //Loop through
        for (WebElement checkbox : checkBoxes) {
            String color = checkbox.getAttribute("value");

            //make a selection if the color is purple
            if(color.equalsIgnoreCase("purple")) {
                checkbox.click();
            }
        }

    }
}