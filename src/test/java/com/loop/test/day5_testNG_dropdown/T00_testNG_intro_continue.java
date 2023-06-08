package com.loop.test.day5_testNG_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class T00_testNG_intro_continue {
    @AfterClass
    public void tearDown(){
        System.out.println("After class is running");
    }
    @BeforeClass
    public void setUp(){
        System.out.println("Before class");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method");
    }



    @Test (priority = 2)
    public void test1(){
        System.out.println("TestNG test is running");
        String actual = "Loop";
        String expected = "Loop";
        Assert.assertEquals(actual, expected, actual+ " is not matching with " + expected);
    }

    @Test(priority = 1)
    public  void test2(){
        System.out.println("Testing test 2 is running");
    }


}
