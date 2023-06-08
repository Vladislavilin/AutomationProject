package com.loop.test.home_tasks.day9;

import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class extra_task {
    @Test
    public void test() throws InterruptedException {

        WebDriver driver1 = Driver.getDriver();
        DocuportUtils.login("advisor");


        WebElement myUploadLeft = driver1.findElement(By.xpath("//span[contains(text(),'My uploads')]"));
        myUploadLeft.click();
        WebElement uploadDocuments = driver1.findElement(By.xpath("//span[contains(text(),'Upload documents')]"));
        uploadDocuments.click();
        Thread.sleep(1000);

        driver1.findElement(By.xpath("//input[@type='file']")).sendKeys(" /Users/kamillagolubeva/Desktop/some-file (3).txt");
        Thread.sleep(1500);
        driver1.findElement(By.xpath("(//div[@class='v-input__icon v-input__icon--append'])[2]")).click();
        driver1.findElement(By.xpath("(//div[.='Client'])[5]")).click();
        driver1.findElement(By.xpath("(//div[.='Test']/div/div)[1]")).click();
        Thread.sleep(1500);
        driver1.findElement(By.xpath("(//h6[.=' Doc Type ']/../following-sibling::div/following-sibling::div/following-sibling::div/span/span)[1]")).click();
        driver1.findElement(By.xpath("//label[.='Description']/following-sibling::textarea")).sendKeys("Hello Nadir ");
        driver1.findElement(By.xpath("//span[.=' Upload ']")).click();


    }
}
