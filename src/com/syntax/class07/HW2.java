package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {

    /*
    Navigate to http://www.uitestpractice.com/Students/Contact
    Click on the link
    Get text
    Print out in the console
     */
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        WebElement linkText = driver.findElement(By.xpath("//*[text() = 'This is a Ajax link']"));
        linkText.click();

        WebElement text = driver.findElement(By.className("ContactUs"));
        String getText = text.getText();
        System.out.println(getText);
    }
}
