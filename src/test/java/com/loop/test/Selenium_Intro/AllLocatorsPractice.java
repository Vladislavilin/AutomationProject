package com.loop.test.Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Vlad");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Ilin");
WebElement email = driver.findElement(By.id("userEmail"));
email.sendKeys("vlad@gmail.com");


//WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
//
//dob.clear();

        WebElement button = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        button.click();

        WebElement number = driver.findElement(By.id("userNumber"));
        number.sendKeys("999-99-99");

        WebElement subject = driver.findElement(By.className(" css-2b097c-container"));
        subject.sendKeys("English");
        WebElement button2 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        button2.click();


//Thread.sleep(2000);


//        driver.quit();
    }
}
