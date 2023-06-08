package com.loop.test.day4_xpath_findElements;

import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_TestNG_Intro {
    @Test
    public void Nadir (){
        System.out.println("Hello Nadir");
        String actual = "Nair";
        String expected = "Nair";
        Assert.assertEquals(actual,expected);

    }

}
