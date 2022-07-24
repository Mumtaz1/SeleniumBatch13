package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW1 {

    /*
    Go to https://the-internet.herokuapp.com/dynamic_controls
    Click on checkbox and click on remove
    Verify the text
    Click on enable verify the textbox is enabled
    Enter text and click disable
    Verify the textbox is disabled
     */
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);

        WebElement checkBox = driver.findElement(By.xpath("//*[@type = 'checkbox']"));
        checkBox.click();

        WebElement removeButton = driver.findElement(By.xpath("//*[text() = 'Remove']"));
        removeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() = 'Remove']")));

        WebElement text = driver.findElement(By.xpath("//form[@id = 'checkbox-example']/p"));
        System.out.println(text.getText());

        WebElement enableButton = driver.findElement(By.xpath("//*[text() = 'Enable']"));
        enableButton.click();

        WebElement textMessage = driver.findElement(By.xpath("//p[@id = 'message']"));
        System.out.println(textMessage.getText());

        WebElement sendTextMessage = driver.findElement(By.xpath("//input[@type = 'text']"));
        sendTextMessage.sendKeys("123456");

        enableButton.click();

        WebElement textMessageDisabled = driver.findElement(By.xpath("//p[@id = 'message']"));
        System.out.println(textMessageDisabled.getText());
    }
}