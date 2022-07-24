package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Launch the browser
   /*     driver.get("https://syntaxprojects.com/index.php");  //get waits for the page to load

      //  driver.navigate().to("https://google.com");
        Thread.sleep(2000);
        WebElement button1  = driver.findElement(By.linkText("Start Practising"));
        button1.click();

        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Proceed Next")).click(); */

        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        //etner some value in the text bos
        WebElement textBox = driver.findElement(By.id("user-message"));
        textBox.sendKeys("abracadara");


    }
}
