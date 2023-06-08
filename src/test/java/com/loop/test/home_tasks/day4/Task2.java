package com.loop.test.home_tasks.day4;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
1. go to https://www.etsy.com/
2. search for rings
3. validate that Estimated Arrival shows any time
3. click Estimated Arrival dropdown
4. click Select custom date
5. choose may 30 from dropdown
6. validate Estimated Arrival shows may 30
 */
public class Task2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
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
        WebElement searchBar = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBar.sendKeys("rings");
        WebElement submitButton = driver.findElement(By.xpath("//button[@value='Search']"));
        submitButton.click();

        // 3. validate that Estimated Arrival shows any time
        WebElement dropdownEstimate = driver.findElement(By.xpath("//span[contains(text(), 'Estimated Arrival')]"));
        Assert.assertEquals(dropdownEstimate.getText(),"Estimated Arrival Any time");

        //3. click Estimated Arrival dropdown
        dropdownEstimate.click();

        //4. click Select custom date
        Select customDate = new Select(driver.findElement(By.xpath("//select[@id='edd_select_tf']")));
        System.out.println(customDate.getFirstSelectedOption().getText());

        //5. choose may 30 from dropdown
        customDate.selectByVisibleText("By May 30");


        //6. validate Estimated Arrival shows may 30
        Assert.assertEquals(customDate.getFirstSelectedOption().getText(),"B May 30");



    }
}
