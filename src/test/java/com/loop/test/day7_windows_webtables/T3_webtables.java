package com.loop.test.day7_windows_webtables;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


/*
1. login as an advisor
    2. go to users
    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that
 */
public class T3_webtables extends TestBase {

    @Test
    public void test_web_tables() {


    driver.get(DocuportConstants.DOCUPORT_URL);
        DocuportUtils.login(DocuportConstants.ADVISOR);

        WebElement users = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();
       String actual =  DocuportWebTableUtils.returnAnyField(Driver.getDriver(),DocuportConstants.ALEX_EMAIL,DocuportConstants.USERNAME);
       String expected = "Alex De Souza";

       assertEquals(actual,expected);





}
}
