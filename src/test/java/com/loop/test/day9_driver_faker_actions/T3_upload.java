package com.loop.test.day9_driver_faker_actions;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T3_upload {
/*
1. Go to “http://demo.guru99.com/test/upload”
    2. Upload file into Choose File
    3. Click terms of service check box
    4. Click Submit File button
    5. Validate expected message appeared. Expected: “1 file has been successfully uploaded.
 */
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("guru99.url"));
        String path = "/Users/kamillagolubeva/Desktop/some-file (2).txt";

       //as argument pass as String it's gonna be the path of the location if the file
        Driver.getDriver().findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys(path);
      Driver.getDriver().findElement(By.id("terms")).click();
      Driver.getDriver().findElement(By.xpath("//button[@id='submitbutton']")).click();

      Thread.sleep(1500);
      String expected = "1 file\n"+"has been successfully uploaded.";
      assertEquals(expected,Driver.getDriver().findElement(By.xpath("//h3[@id='res']")).getText());



    }
}
