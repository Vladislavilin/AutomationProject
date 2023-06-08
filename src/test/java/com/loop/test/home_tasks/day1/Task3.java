package com.loop.test.home_tasks.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. Open Docuport app
2. Send UserName // b1g2_client@gmail.com
3. Send password // Group2
4. Click login
 */
public class Task3 {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");

        WebElement findByIdUSerName = driver.findElement(By.id("input-14"));
        findByIdUSerName.sendKeys("b1g2_supervisor@gmail.com");
        WebElement findByIdPassword = driver.findElement(By.id("input-15"));

        findByIdPassword.sendKeys("Group2");

        WebElement findLogin = driver.findElement(By.className("v-btn__content"));
        findLogin.click();
        

        Thread.sleep(4000);

        driver.quit();
    }
}
