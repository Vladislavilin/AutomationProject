package com.loop.test.home_tasks.day4;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/*
1. go to http://the-internet.herokuapp.com/dropdown
2. validate "Please select an option" is selected by default
3. Choose option 1 and validate that it is selected
4. Choose option 2 and validate that it is selected
5. Validate dropdown name is "Dropdown List"
 */
public class Task1 {

    WebDriver driver;
    String expected = "Please select an option";
    String actual;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebDriverFactory.wait(driver,10);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test(){

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Please select an option");

        dropdown.selectByVisibleText("Option 1");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Option 1");

        dropdown.selectByValue("2");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Option 1");

        WebElement dropDownList = driver.findElement(By.xpath("//div[@id='content']/div/h3[contains(text(),'Dropdown List')]"));
        Assert.assertEquals(dropDownList.getText(), "Dropdown List");




    }

}
