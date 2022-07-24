package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {

    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    //    driver.manage().window().maximize();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();

        WebElement instagramButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement facebookButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement instagramAndFacebookButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));

        instagramButton.click();
        facebookButton.click();
        instagramAndFacebookButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size()); //4
        Iterator<String> it = allWindowHandles.iterator();
        while (it.hasNext()) { //start iterating through the handles (tabs)
            String handle = it.next(); //get one handle from my set (tab)
            if (!mainPageHandle.equals(handle)) { //set a condition where main page is not equal to the handle
                driver.switchTo().window(handle); //switch to that specific handle (window)
                //driver.manage().window().maximize();
                String title = driver.getTitle(); //get the title
                System.out.println(title);
                driver.close(); //close the tab
            }
        }
        driver.switchTo().window(mainPageHandle);
        instagramButton.click();
    }
}