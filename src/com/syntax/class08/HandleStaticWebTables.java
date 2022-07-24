package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandleStaticWebTables {

    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    //    driver.manage().window().maximize();
        driver.get(url);

        //Gets all the table row data
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        //To get data for table data (column) 2 type:
        //    List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
        //To get data for table row 1 and table data (column) 4 type:
        //    List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr[1]/td[4]"));
        System.out.println(rowData.size());

        Iterator<WebElement> it = rowData.iterator();
        while(it.hasNext()) {
            WebElement row = it.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }

        System.out.println("---------------");
        //We want to get each and every column data and print it out
        List<WebElement> colsData = driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
        for(WebElement colData: colsData) {
            String colText = colData.getText();
            System.out.println(colText);
        }
    }
}