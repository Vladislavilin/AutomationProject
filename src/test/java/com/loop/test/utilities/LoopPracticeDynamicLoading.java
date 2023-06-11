package com.loop.test.utilities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoopPracticeDynamicLoading {
    LoopPracticeDynamicLoading page;

    @BeforeMethod
    public void setUp(){
        page = new LoopPracticeDynamicLoading();
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
    }

    @Test
    public void test_method(){
        BrowserUtils.loopLinkClick("Context Menu");
    }
}
