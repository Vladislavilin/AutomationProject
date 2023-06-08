package com.loop.test.day9_driver_faker_actions;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T5_drag_drop {
    /*
    1- Open a chrome browser
    2- Go to: https://demo.guru99.com/test/drag_drop.html
    3- Drag “BANK” and drop into Account area under Debit Side
    4- Drag “5000” and drop into Amount area under Debit Side
    5- Drag “SALES” and drop into Account area under Credit Side
    6- Drag “5000” and drop into Amount area under Credit Side
    7- Validate “Perfect!” text displayed.
     */
    @Test
    public void drag_drop_test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("guru.drag"));
        WebElement bank = Driver.getDriver().findElement(By.xpath("//a[.=' BANK ']"));
      WebElement debitAccount = Driver.getDriver().findElement(By.xpath("//ol[@id='bank']"));

      Thread.sleep(1500);
        Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(bank,debitAccount).perform();
        action.dragAndDrop(Driver.getDriver().findElement(By.xpath("//a[.=' 5000 ']")),Driver.getDriver().findElement(By.xpath("//li[@class='placeholder']"))).perform();




                action.dragAndDrop(Driver.getDriver().findElement(By.partialLinkText("SALES")),Driver.getDriver().findElement(By.xpath("//ol[@id='loan']"))).perform();

        action.dragAndDrop(Driver.getDriver().findElement(By.xpath("//a[.=' 5000 ']")),Driver.getDriver().findElement(By.xpath("//ol[@id='amt8']"))).perform();

        assertEquals(Driver.getDriver().findElement(By.xpath("//a[.='Perfect!']")).getText(),"Perfect!");

        Driver.getDriver().close();







    }



}
