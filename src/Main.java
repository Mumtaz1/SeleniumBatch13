import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        //1. Set a system property
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //2. Create an object of webdriver type
        WebDriver driver = new ChromeDriver(); //Launch the browser
        //3. Navigate to desired URL
        driver.get("https://www.google.com/");
/*
        driver.navigate().to("www.facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();    */

    }
}