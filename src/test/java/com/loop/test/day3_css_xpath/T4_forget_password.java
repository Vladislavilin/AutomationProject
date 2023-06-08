package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_forget_password {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to("https://beta.docuport.app");
        WebElement resetPassword = driver.findElement(By.cssSelector("a[href='/reset-password']"));
        resetPassword.click();
        WebElement resetPasswordText = driver.findElement(By.cssSelector("[class='text-h5 font-weight-medium mb-6']"));

        if (resetPasswordText.isDisplayed()) {
            System.out.println("\"Reset Password\" text is displayed  TEST PASSED");
        } else {
            System.out.println("\"Reset Password\" text is not displayed  TEST FAILED");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
