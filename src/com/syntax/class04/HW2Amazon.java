package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2Amazon {
    /*
    Amazon link count:
    Open chrome browser
    Go to "https://www.amazon.com/"
    Get all links
    Get number of links that has text
    Print to console only the links that has text
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Launch the browser
        driver.get("https://www.amazon.com/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links " + allLinks.size());

        int numLinksWithText = 0;
        for(WebElement link : allLinks) {
            String linkText = link.getText();
            String fullLink = link.getAttribute("href");
            if(!linkText.isEmpty()) {
                numLinksWithText ++;
                System.out.println(linkText + "---->" + fullLink);
            }
        }
        System.out.println("Number of links with text is: " + numLinksWithText);
        driver.quit();
    }
}