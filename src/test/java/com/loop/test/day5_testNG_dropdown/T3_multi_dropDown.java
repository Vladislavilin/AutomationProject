package com.loop.test.day5_testNG_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.annotation.Target;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
/*
/*
    1. Open Chrome browser
    2. Go to https://demoqa.com/select-menu
    3. Select all the options from multiple select dropdown.
    4. Print out all selected values.
    5. Deselect all values.
     */

public class T3_multi_dropDown {
    WebDriver driver;
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
    @BeforeMethod //select[@id='cars']
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test(){

        Select dropdow =new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        Assert.assertTrue(dropdow.isMultiple());

//        dropdow.selectByIndex(3);
//        dropdow.selectByValue("saab");
//        dropdow.selectByVisibleText("Opel");

        List< WebElement> options = new ArrayList<>();
        options = dropdow.getOptions();
options.forEach(option ->  option.click());

        for (WebElement option : options) {

            option.isSelected();
            System.out.println("option= " + option.getText());
        }
        dropdow.deselectAll();


    }
}
