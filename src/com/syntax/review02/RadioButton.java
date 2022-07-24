package com.syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static String url = "https://demo.guru99.com/test/radio.html";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //Access the webElement radioBtn "Option 3"
        WebElement option3 = driver.findElement(By.xpath("//input[@value='Option 3']"));
        //check if the radio button is selected
        boolean state = option3.isSelected();
        System.out.println("The state of the radio button is :" + state);
        //check if the radio button is displayed
        boolean displayed = option3.isDisplayed();
        System.out.println("Is the radio button displayed : " + displayed);
        //check if the radio button is enabled
        boolean enabled = option3.isEnabled();
        System.out.println("Is the radio button enabled: " + enabled);
        //select the radio button
        option3.click();
        //check if the radio button is selected
        state = option3.isSelected();
        System.out.println("The state of the radio button is :" + state);

    }

}
