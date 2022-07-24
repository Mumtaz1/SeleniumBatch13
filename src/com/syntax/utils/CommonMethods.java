package com.syntax.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {

     /*
    Create a package and name it as utils
    Create a class and name as CommonMethods
    Create functions (methods) to open and quit the browsers
    Open method has to accept a url as a parameter
     */

    //HW2

    public static String url = "http://syntaxprojects.com";

    WebDriver driver = new ChromeDriver();

    public void openBrowser() {
        driver.get(url);
    }

    public void quitBrowser() {
        driver.quit();
    }
}
class Test extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        CommonMethods commonMethods = new CommonMethods();
        commonMethods.openBrowser();
        Thread.sleep(2000);
        commonMethods.quitBrowser();
    }
}