package com.syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    public static String url = "https://demo.guru99.com/insurance/v1/register.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        // Access the text box Surname using absolute xpath
        WebElement surName = driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input"));
        surName.sendKeys("Doe");

        // Access the textbox firstname using xpath
        WebElement firstName = driver.findElement(By.xpath("//input[@id='user_firstname']"));
        firstName.sendKeys("John");

        // Access the webElement date of birth and print the text on console
        WebElement dateOfBirth = driver.findElement(By.xpath("//label[text()='Date of Birth']"));
        System.out.println(dateOfBirth.getText());

        // Access the webElement licence period and print on the console
        WebElement licence = driver.findElement(By.xpath("//label[contains (text(),'Licence Period')]"));
        System.out.println(licence.getText());

        // Access the webElement radio button and click on it
        WebElement radioButton = driver.findElement(By.xpath("//label[text() = 'Full']/following-sibling::input"));
        radioButton.click();

        // Access the textbox phone number and enter the number
        WebElement phoneNUmb = driver.findElement(By.cssSelector("input#user_phone"));
        phoneNUmb.sendKeys("0114115551212");

        // Access the webElement address and send in the address
        WebElement address = driver.findElement(By.cssSelector("input[id*= 'attributes_street']"));
        address.sendKeys("London");

        //
        WebElement a = driver.findElement(By.cssSelector("input[id*= 'attributes_street']"));


    }
}