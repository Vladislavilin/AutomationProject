package com.loop.test.day5_testNG_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
//1. Open Chrome browser
//        2. Go to http://the-internet.herokuapp.com/add_remove_elements/
//        3. Click to “Add Element” button
//        4. Verify “Delete” button is displayed after clicking.
//        5. Click to “Delete” button.
//        6. Verify “Delete” button is NOT displayed after clicking.
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */
public class T0_staleElementException {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement addElement= driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
        addElement.click();



        WebElement deleteButton =  driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));





        System.out.println((deleteButton.isDisplayed())? "TEST PASSED => DELETE BUTTON IS  DISPLAYED ":"TEST FAILED => DELETE BUTTON IS NOT DISPLAYED");
        System.out.println("------CLICKING THE DELETE BUTTON------");


        deleteButton.click();


//        System.out.println((deleteButton.isDisplayed())? "TEST FAILED => DELETE BUTTON IS STILL DISPLAYED ":"TEST PASSED => DELETE BUTTON IS NOT DISPLAYED ANYMORE");

        try{
            deleteButton.isDisplayed();
        }catch (StaleElementReferenceException e){
            System.out.println("Catching the Exception");
            System.out.println("DELETE BUTTON IS NOT DISPLAYED ANYMORE => TEST PASSED");
        }









    }
}
