package com.loop.pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDynamicLoadingPage {
public LoopPracticeDynamicLoadingPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(xpath = "//div[@id='alert']")
    public WebElement done;

    @FindBy(xpath = "//div[@id='alert']/following-sibling::img")
    public WebElement image;


}
