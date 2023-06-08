package com.loop.test.home_tasks.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();



        WebElement topRightGmail = driver.findElement(By.linkText("Gmail"));
        topRightGmail.click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Expected title \"" + expectedTitle + "\" matches to actual title \"" + actualTitle + "\" - TEST PASSED");

        }else{
            System.out.println("Expected title \"" + expectedTitle + "\" doesn't match to actual title \"" + actualTitle + "\" - TEST FAILED");
        }

        driver.navigate().back();

        String actualBackTitle = driver.getTitle();
        String expectedBackTitle = "Google";

        if(actualBackTitle.contains(expectedBackTitle)){
            System.out.println("Expected title \"" + expectedBackTitle + "\"  matches to actual title \"" + actualTitle + "\" - TEST PASSED");
        }else{
            System.out.println("Expected title \"" + expectedBackTitle + "\" doesn't match to actual title \"" + actualTitle + "\" - TEST FAILED");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
