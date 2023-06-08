package com.loop.test.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class BrowserUtils {
    /**
     * validate if driver switched to expected url and title
     * @param driver
     * @param expectedUrl
     * @param expectedTitle
     * @author Vlad
     * implements assertion
     * note: usually we do not do validation in t\method, this is for practicing purposes
     */
    public static void switchWindowAndValidate(WebDriver driver,String expectedUrl, String expectedTitle){
        expectedUrl = expectedUrl.toLowerCase();
        expectedTitle = expectedTitle.toLowerCase();

        Set<String> windowHandles = driver.getWindowHandles();

        for(String each : windowHandles){
            driver.switchTo().window(each);

            if(driver.getCurrentUrl().toLowerCase().contains(expectedUrl)){
                break;
            }
        }

       assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));

    }

    /**
     * switches to new window by the exact title
     * return to original window if windows with give title not found
     * @param driver
     * @param targetTitle
     * author Vlad
     */
    public static void switchToWindow(WebDriver driver, String targetTitle){
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(targetTitle)){
                return;
            }
        }
        driver.switchTo().window(origin);
    }
    public static void validateTitle(WebDriver driver, String expectedTitle){
        assertEquals(driver.getTitle(),expectedTitle);
    }

}