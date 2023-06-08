package com.loop.test.day5_testNG_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T000_testNG_with_selenium {

    WebDriver driver;
    String expected;
    String actual;
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

 @BeforeMethod
 public void setUp(){
     driver = WebDriverFactory.getDriver("chrome");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }
    @Test
    public void googleTitle (){

        driver.get("https://www.google.com");
        System.out.println("((RemoteWebDriver)driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Google";
         actual = driver.getTitle();

        Assert.assertEquals(actual,expected, "DOESNT MATCH ");




    }
    @Test
    public void docuportTitle(){

        driver.get("https://beta.docuport.app");
        System.out.println("((RemoteWebDriver)driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
         expected = "Docuport";
         actual = driver.getTitle();

        Assert.assertEquals(actual,expected, "DOESNT MATCH ");
        //also we have Assert.assertTrue(); inside of paranthesis boolean value;





    }

}
