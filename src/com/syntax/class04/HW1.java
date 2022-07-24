package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HW1 {
    /*
    Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    Enter valid username and password (username - Admin, password - Hum@nhrm123)
    Click on login button
    Then verify Syntax Logo is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
     //   System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
     //   WebDriver driver = new ChromeDriver(); //Launch the browser

        //New stuff added from https://www.youtube.com/watch?v=cex-ILt7OrE

        //setting for the Chrome browser:
        DesiredCapabilities desiredCap = DesiredCapabilities.chrome();
        desiredCap.acceptInsecureCerts();
        desiredCap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        desiredCap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        ChromeOptions cOptions = new ChromeOptions();
        cOptions.merge(desiredCap);

        //    WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Launch the browser
        //   WebDriver driver = new ChromeDriver(); //Launch the browser
        //System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        // WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();

        //   ChromeOptions options = new ChromeOptions();
     //   options.addArguments("--allow-running-insecure-content");
       // driver.get("https://www.ebay.com/");
       driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        Thread.sleep(2000);
        driver.navigate().refresh();
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@hrm123");

        WebElement loginButton = driver.findElement(By.cssSelector("input.button"));
        loginButton.click();

        WebElement syntaxLogo = driver.findElement(By.cssSelector("img[src $= 'syntax.png']"));
        boolean isSyntaxLogoDisplayed = syntaxLogo.isDisplayed();
        if (isSyntaxLogoDisplayed) {
            System.out.println("Syntax Logo is displayed");
        } else {
            System.out.println("Syntax Logo is not displayed");
        }
        driver.quit();
    }
}