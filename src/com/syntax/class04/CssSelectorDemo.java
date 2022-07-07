package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Launch the browser
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();

        WebElement startPractisingButton = driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPractisingButton.click();
        Thread.sleep(2000);

        WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        simpleFormDemo.click();
        Thread.sleep(2000);

        WebElement enterMessage = driver.findElement(By.cssSelector("input[placeholder ^= 'Please enter']"));
        enterMessage.sendKeys("Sameer loves Absolute xpath");
        Thread.sleep(2000);

        WebElement showMessage = driver.findElement(By.cssSelector("button[onClick *= 'show']"));
        showMessage.click();

        Thread.sleep(2000);
        driver.quit();

    }
}