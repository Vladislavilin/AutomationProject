package com.loop.test.home_tasks.day2;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*
1. navigate to docuport application
2. validate placeholders for user name and password
3. without sending username and password click login button
4. validate username and password error messages
 */
public class Docuport2 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
        WebElement userNamePlaceholder = driver.findElement(By.cssSelector("label[for='input-14']"));
        String actualUserNamePlaceholderName = userNamePlaceholder.getText();
        String expectedUserNamePlaceholderName = "Username or email";
        if (actualUserNamePlaceholderName.equals(expectedUserNamePlaceholderName)) {
            System.out.println("TEST PASSED! Actual login placeholder name \"" +actualUserNamePlaceholderName+"\" matches to expected login placeholder name \"" + expectedUserNamePlaceholderName+"\"");
        }else{
            System.err.println("TEST FAILED!");
            System.out.println("Actual login placeholder name \"" +actualUserNamePlaceholderName+"\" DOESN'T MATCH to expected login placeholder name \"" + expectedUserNamePlaceholderName+"\"");

        }

        WebElement passwordPlaceholder = driver.findElement(By.cssSelector("label[for='input-15']"));
        String actualPasswordPlaceholderName = passwordPlaceholder.getText();
        String expectedPasswordPlaceholderName = "Password";

        if (actualPasswordPlaceholderName.equals(expectedPasswordPlaceholderName)) {
            System.out.println("TEST PASSED! Actual login placeholder name \"" +actualPasswordPlaceholderName+"\" matches to expected login placeholder name \"" + expectedPasswordPlaceholderName+"\"");
        }else{
            System.err.println("TEST FAILED!");
            System.out.println("Actual login placeholder name \"" +actualPasswordPlaceholderName+"\" DOESN'T MATCH to expected login placeholder name \"" + expectedPasswordPlaceholderName+"\"");

        }
 

 WebElement loginButton = driver.findElement(By.cssSelector("span.v-btn__content"));
        loginButton.click();

        WebElement loginError = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[1]"));
        String actualLoginErrorMessage = loginError.getText();
        String expectedLoginErrorMessage = "Please enter your username or email address";
        System.out.println("--------");
        if(expectedLoginErrorMessage.equals(actualLoginErrorMessage)){
            System.out.println("TEST PASSED! Actual login error message \"" + actualLoginErrorMessage + "\" matches to expected login error message \"" + expectedLoginErrorMessage + "\"");
        }else{
            System.err.println("TEST FAILED!");
            System.out.println("Actual login error message \"" + actualLoginErrorMessage + "\" DIDN'T match to expected login error message \"" + expectedLoginErrorMessage + "\"");

        }
        WebElement passwordError = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[2]"));

        String actualPasswordErrorMEssage = passwordError.getText();

        String expectedPasswordErrorMessage = "Please enter your password";
        System.out.println("------");

        if(expectedPasswordErrorMessage.equals(actualPasswordErrorMEssage)){
            System.out.println("TEST PASSED! Actual password error message \"" + actualPasswordErrorMEssage + "\" matches to expected password error message \"" + expectedPasswordErrorMessage + "\"");
        }else{
            System.err.println("TEST FAILED!");
            System.out.println("Actual password error message \"" + actualPasswordErrorMEssage + "\" DIDN'T match to expected password error message \"" + expectedPasswordErrorMessage + "\"");

        }
        ChromeDriver driver1 = (ChromeDriver) driver;
       
        Thread.sleep(2000);
        driver.quit();
    }
}
