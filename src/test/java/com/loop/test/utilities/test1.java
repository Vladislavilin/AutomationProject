package com.loop.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
    public static void main(String[] args) {
        String[] things = {"house", "shed", "slide",
                "zebra", "park", "garden"};
        for (String s : things) {

            switch (s.charAt(1)) {
                case 'h':
                    System.out.print(1);
                    break; // o , h, l, e, a, a // 451452323
                case 'a':
                    System.out.print(2);
                case 's':
                    System.out.print(3);
                    break;
                case 'o':
                    break;
                default:
                    System.out.print(4);
                case 'p':
                    System.out.print(5);
                    break;
                case 'z':
                    System.out.print(6);
                case 'l':
                    break;
                case 'g':
                    System.out.print(7);
            }
        }

    }
//        LoopCampVerselUtil.loopCampPractice("add-remove-elements");


@Test
public void test() throws InterruptedException {
        Driver.getDriver().get("https://loopcamp.vercel.app/");


    BrowserUtils.clickWithJS(Driver.getDriver().findElement(By.xpath(" //a[.='LOOPCAMP']")));
}






}