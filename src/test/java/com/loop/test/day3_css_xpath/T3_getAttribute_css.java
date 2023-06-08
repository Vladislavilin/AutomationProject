package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_css {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.navigate().to("https://beta.docuport.app");

        WebElement logo = driver.findElement(By.cssSelector("img[alt='Docuport']"));
        String docuport = logo.getAttribute("alt");

        if(docuport.equalsIgnoreCase(DocuportConstants.LOGO_DOCUPORT)){
            System.out.println("Expected logo \"" +DocuportConstants.LOGO_DOCUPORT + "\" matched to actual logo \"" + docuport+"\" TEST PASSED" );
        }else{
            System.out.println("Expected logo \"" +DocuportConstants.LOGO_DOCUPORT + "\" doesn't match to actual logo \"" + docuport+"\" TEST FAILED" );
        }



        WebElement userName = driver.findElement(By.cssSelector("input[id='input-14']"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();
        Thread.sleep(3000);

        WebElement homeIcon = driver.findElement(By.cssSelector("[class='v-icon notranslate mdi mdi-home theme--light']"));


        if (homeIcon.isDisplayed()) {
            System.out.println("Home icon is displayed  TEST PASSED");
        } else {
            System.out.println("Home icon is not displayed  TEST FAILED");
        }



    }
}
