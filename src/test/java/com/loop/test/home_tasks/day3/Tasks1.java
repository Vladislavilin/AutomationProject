package com.loop.test.home_tasks.day3;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Tasks1 {
    @Test
    public void testTask1 () throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //1. go to docuport app +

        DocuportUtils.login(DocuportConstants.CLIENT);

        //(wait  up to 30 sec until the buttons are displayed)
        WebDriverFactory.visible(driver,30,"//*[@class='body-1']");
        List<WebElement> leftItems = driver.findElements(By.xpath("//*[@class='body-1']"));
        String[] arr = new String[4];
        int index =0;
        for (WebElement each:leftItems) {
            System.out.println(((each.isDisplayed()) ? "TEST PASSED ==> \"" + each.getText() + "\" is displayed" : "TEST FAILED ==> \"" + each.getText() + "\" is NOT displayed"));
            arr[index] = each.getText();
            index++;

        }

        WebElement threeLines  = driver.findElement(By.xpath("//i[@class='v-icon notranslate mdi mdi-menu theme--light']"));
        threeLines.click();
        //(wait  up to 30 sec until the buttons are disappeared)
        WebDriverFactory.invisible(driver,30,"//*[@class='body-1']");

        System.out.println("--------after clicking three lines-------");
        index = 0;
            for (WebElement each :leftItems) {
                System.out.println(((each.isDisplayed())?"TEST FAILED ==> \""+ arr[index]+ "\" is displayed":"TEST PASSED ==> \""+ arr[index]+ "\" is NOT displayed"));
                index++;
            }
        driver.quit();
        }
    }
