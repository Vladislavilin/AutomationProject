package com.loop.test.Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        String expectTitle = "Google";
        String expectUrl = "https://www.google.com";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle " + actualTitle );

        if(actualTitle.contains(expectTitle)){
            System.out.println("Actual title " + actualTitle+ " mached expected title " + expectTitle+ " = TEST PASSED");
        }else{
            System.out.println("Actual title " + actualTitle+ " doesnt mach expected title " + expectTitle + " = TEST FAILED");
        }

        String actualUrl = driver.getCurrentUrl();
        System.out.println("actual URL " + actualUrl);
        if(actualUrl.contains(expectUrl)){
            System.out.println("Actual URL " + actualUrl+ " matched expected URL "+ expectUrl+ " = TEST PASSED");
        }else{
            System.out.println("Actual URL " + actualUrl+ " doesnt match expected URL "+ expectUrl+ " = TEST FAILED");

        }

        Thread.sleep(2000);




        driver.quit();


    }
}
