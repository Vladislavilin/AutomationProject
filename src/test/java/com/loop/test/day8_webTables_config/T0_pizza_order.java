package com.loop.test.day8_webTables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.LoopCampVerselUtil;
import com.loop.test.utilities.PizzaOrderWebTableUtils;
import com.loop.test.utilities.PizzaConstants;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
/*
  /*
    1. go to https://loopcamp.vercel.app/web-tables.html
    2. create a method to test given field for a given name
     */

public class T0_pizza_order extends TestBase {

    @Test
    public void validate_card_for_alexandra(){
        driver.get(LoopCampVerselUtil.loopCampPractice("web-tables"));
        String name = "Alexandra Gray";
        String expectedCardNumber = "321456789012";
        String actualCardNumber = driver.findElement(By.xpath("//td[contains(text(),'321456789012')]")).getText();
        assertEquals(actualCardNumber, expectedCardNumber);
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Card Number"),expectedCardNumber);

    }
    @Test
    public void test_pizza_type(){
        driver.get(LoopCampVerselUtil.loopCampPractice("web-tables"));
        String name = "Alexandra Gray";
        String expectedPizzaType = "Thin Crust";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Pizza type"), expectedPizzaType);
    }

    @Test
    public void test_amount(){
        driver.get(LoopCampVerselUtil.loopCampPractice("web-tables"));
        String name = "John Doe";
        String expectedAmount = "3";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Amount"),expectedAmount);
    }
    @Test
    public void test_date(){
        driver.get(LoopCampVerselUtil.loopCampPractice("web-tables"));
        String name = "Stewart Dawidson";
        String expectedDate ="03/29/2021";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, PizzaConstants.DATE),expectedDate);

    }

    @Test
    public void test_street(){
        driver.get(LoopCampVerselUtil.loopCampPractice("web-tables"));
        String name = "Bart Fisher";
        String expectedStreet ="35, Rock st.";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, PizzaConstants.STREET),expectedStreet);

    }

    @Test
    public void test_city(){
        driver.get(LoopCampVerselUtil.loopCampPractice("web-tables"));
        String name = "Ned Stark";
        String expectedCity ="Newcastle";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, PizzaConstants.CITY),expectedCity);

    }

    @Test
    public void test_state(){
        driver.get(LoopCampVerselUtil.loopCampPractice("web-tables"));
        String name = "Bob Martin";
        String expectedState ="US";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, PizzaConstants.STATE),expectedState);

    }

    @Test
    public void test_zip(){
        driver.get(LoopCampVerselUtil.loopCampPractice("web-tables"));
        String name = "Samuel Jackson";
        String expectedZip ="53665";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, PizzaConstants.ZIP),expectedZip);

    }

    @Test
    public void test_card(){
        driver.get(LoopCampVerselUtil.loopCampPractice("web-tables"));
        String name = "Robert Baratheon";
        String expectedCard ="MasterCard";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, PizzaConstants.CARD),expectedCard);

    }

    @Test
    public void test_card_number(){
        driver.get(LoopCampVerselUtil.loopCampPractice("web-tables"));
        String name = "John Doe";
        String expectedCardNumber ="980077987700";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, PizzaConstants.CARD_NUMBER),expectedCardNumber);

    }

    @Test
    public void test_exp(){
        driver.get(LoopCampVerselUtil.loopCampPractice("web-tables"));
        String name = "Alexandra Gray";
        String expectedExp ="02/24";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, PizzaConstants.EXP),expectedExp);

    }
}
