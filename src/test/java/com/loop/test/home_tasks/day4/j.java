package com.loop.test.home_tasks.day4;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class j {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
        WebDriverFactory.wait(driver,10);
    }
    @AfterMethod
    public void tearDown(){
//        driver.close();
    }


    @Test
    public void test(){

        // 2. search for rings
        WebElement searchBar = WebDriverFactory.findElementByXpath(driver,"//input[@id='global-enhancements-search-query']");

        searchBar.sendKeys("rings");
        WebElement submitButton = driver.findElement(By.xpath("//button[@value='Search']"));
        submitButton.click();
    }
}
