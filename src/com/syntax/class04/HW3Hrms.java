package com.syntax.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3Hrms {

    /*
    HRMS Application Negative Login:
    Open chrome browser
    Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    Enter valid username
    Leave password field empty
    Click on login button
    Verify error message with text "Password cannot be empty" is displayed.
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Launch the browser
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");


    }
}
