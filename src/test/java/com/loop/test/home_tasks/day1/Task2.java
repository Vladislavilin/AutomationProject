package com.loop.test.home_tasks.day1;
/*
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();

        WebElement searchByName = driver.findElement(By.name("search_query"));
        searchByName.click();
        searchByName.sendKeys("wooden spoon" + Keys.ENTER);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon | Etsy";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("TEST PASSED: actual title \"" + actualTitle+ "\" matches to expected title \"" + expectedTitle+"\"");
        }else{
            System.out.println("TEST FAILED: actual title \"" + actualTitle+ "\" doesn't match to expected title \"" + expectedTitle +"\"");
        }

        Thread.sleep(1000);
        driver.quit();

    }
}
