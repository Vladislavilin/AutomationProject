package com.loop.test.home_tasks.day2;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
1. login to docuport application
2. logout from docuport application
3. Validate successful login
4. Validate successful logout
 */
public class Docuport {
    public static void main(String[] args ) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://beta.docuport.app");
        WebElement login = driver.findElement(By.cssSelector("input#input-14"));
        login.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement password = driver.findElement(By.cssSelector("input#input-15"));
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);

        WebElement loginButton = driver.findElement(By.cssSelector("span.v-btn__content"));
        loginButton.click();

        Thread.sleep(1000);

        WebElement homeIcon = driver.findElement(By.cssSelector("i[class='v-icon notranslate mdi mdi-home theme--light']"));
        if(homeIcon.isDisplayed()){
            System.out.println("Login was successful");


        }else {
            System.out.println("Login was unsuccessful");
        }
        System.out.println("-------");

        Thread.sleep(1000);
        WebElement dropDown=driver.findElement(By.cssSelector("div[class='v-avatar primary']>span"));
        dropDown.click();
        Thread.sleep(3000);

        WebElement logOut = driver.findElement(By.cssSelector("div#list-item-88"));
        logOut.click();
        Thread.sleep(1000);


        driver.navigate().refresh();

        WebElement loginTitle = driver.findElement(By.cssSelector("h1[class='text-h5 font-weight-medium mb-6']"));
        String actualLoginHeader = loginTitle.getText();
        String expectedLoginHeader = "Login";
        if(actualLoginHeader.equals(expectedLoginHeader)){
            System.out.println("Successful Logged Out! Actual Login Header \"" + actualLoginHeader +  "\"Matched to Expected \"" + expectedLoginHeader + "\"");
        }else{
            System.out.println("TEST FAILED! Actual Login Header \"" + actualLoginHeader +  "\"Didnt Match to Expected \"" + expectedLoginHeader + "\"");
        }


        Thread.sleep(1500);
        driver.quit();


    }
}
