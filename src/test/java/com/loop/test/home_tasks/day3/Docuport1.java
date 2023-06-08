package com.loop.test.home_tasks.day3;

/*
1. go to docuport app +
2. validate that Home, Received docs, My uploads, Invitations are displayed
3. press three lines
4. Home, Received docs, My uploads, Invitations will disappear
5. Validate the buttons are not displayed
 */
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Docuport1 {
    @Test
   public void testDocuport() throws InterruptedException {
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

    //1. go to docuport app +

        DocuportUtils.login( DocuportConstants.CLIENT);


        //validate that Home is displayed
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement findHome = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
        System.out.println((findHome.isDisplayed())?"HOME BUTTON IS DISPLAYED ==> TEST PASSED":"HOME BUTTON IS NOT DISPLAYED ==> TEST FAILED");

        //validate that Receive Docs is displayed
        WebElement findReceiveDocs = driver.findElement(By.xpath("//span[starts-with(text(),'Received')]"));
        System.out.println((findReceiveDocs.isDisplayed())?"RECEIVE DOCS BUTTON IS DISPLAYED ==> TEST PASSED":"RECEIVE DOCS BUTTON IS NOT DISPLAYED ==> TEST FAILED");

        //validate that My Uploads is displayed
        WebElement findMyUploads = driver.findElement(By.xpath("//span[contains(text(),'My uploads')]"));
        System.out.println((findMyUploads.isDisplayed())?"MY UPLOADS BUTTON IS DISPLAYED ==> TEST PASSED":"MY UPLOADS  BUTTON IS NOT DISPLAYED ==> TEST FAILED");

        //validate that My Invitations is displayed

        WebElement findInvitations = driver.findElement(By.xpath("//span[starts-with(text(),'Invitations')]"));
        System.out.println((findInvitations.isDisplayed())?"INVITATIONS BUTTON IS DISPLAYED ==> TEST PASSED":"INVITATIONS  BUTTON IS NOT DISPLAYED ==> TEST FAILED");

        System.out.println("--------after pressing three lines-------");
       // press three lines
//        Thread.sleep(5000);
//        WebDriverFactory.wait(driver,30);
        WebElement threeLines  = driver.findElement(By.xpath("//i[@class='v-icon notranslate mdi mdi-menu theme--light']"));
        threeLines.click();

        //validate that Home is disappeared
        WebDriverFactory.invisible(driver,10 , "//span[contains(text(),'Home')]");

        System.out.println((findHome.isDisplayed())?"HOME BUTTON IS DISPLAYED ==> TEST FAILED":"HOME BUTTON IS NOT DISPLAYED ==> TEST PASSED");

        //validate that Receive Docs is disappeared

        System.out.println((findReceiveDocs.isDisplayed())?"RECEIVE DOCS BUTTON IS DISPLAYED ==> TEST FAILED":"RECEIVE DOCS BUTTON IS NOT DISPLAYED ==> TEST PASSED");

        //validate that My Uploads is disappeared

        System.out.println((findMyUploads.isDisplayed())?"MY UPLOADS BUTTON IS DISPLAYED ==> TEST FAILED":"MY UPLOADS  BUTTON IS NOT DISPLAYED ==> TEST PASSED");

        //validate that My Invitations is disappeared


        System.out.println((findInvitations.isDisplayed())?"INVITATIONS BUTTON IS DISPLAYED ==> TEST FAILED":"INVITATIONS  BUTTON IS NOT DISPLAYED ==> TEST PASSED");




        Thread.sleep(2000);
        driver.quit();

    }

}