package com.loop.pages;

import com.loop.test.utilities.BrowserUtils;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
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
        BrowserUtils.loopLinkClick("Dynamic Loading");
    }
}
