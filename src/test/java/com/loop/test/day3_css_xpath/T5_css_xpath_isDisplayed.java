package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* go to http://the-internet.herokuapp.com/forgot_password
 *  locate 5 elements, forgot password, email, email input, retrieve password, powered selenium
 *  css
 * verify those elements are displayed
 */
public class T5_css_xpath_isDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://the-internet.herokuapp.com/forgot_password");
        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));

        if(forgetPasswordHeading.isDisplayed()){
            System.out.println("Forget password heading is displayed");
        }else{
            System.out.println("Forget password heading is not displayed");
        }







        Thread.sleep(3000);
        driver.quit();
    }
}
