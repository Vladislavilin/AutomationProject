package com.loop.test.home_tasks.day9;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class task4_5 {
    @Test
    public void testPowered() throws InterruptedException {
        WebDriver driver= Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("loop.practice"));

        Actions action = new Actions(driver);
        Thread.sleep(1500);
        action.moveToElement(driver.findElement(By.xpath("//a[.='LOOPCAMP']"))).perform();

        action.sendKeys(Keys.PAGE_UP).moveToElement(driver.findElement(By.xpath("//div[@class = 'container']/preceding-sibling::nav"))).build().perform();

    }
}
