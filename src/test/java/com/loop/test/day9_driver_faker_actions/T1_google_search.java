package com.loop.test.day9_driver_faker_actions;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T1_google_search {

    @Test
    public void google_search() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
        System.out.println("((RemoteWebDriver)Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        Driver.getDriver().findElement(By.name("q")).sendKeys("Loop Academy"+ Keys.ENTER);
        assertEquals(Driver.getDriver().getTitle(),"Loop Academy - Google Search");
    }

    @Test
    public void docuport_search(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        System.out.println("((RemoteWebDriver)Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

    }
}
