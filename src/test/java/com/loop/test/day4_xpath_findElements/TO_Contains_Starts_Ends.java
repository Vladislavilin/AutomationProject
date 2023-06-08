package com.loop.test.day4_xpath_findElements;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TO_Contains_Starts_Ends {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

        WebElement loginButton = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        loginButton.click();
    }
}
