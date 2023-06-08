package com.loop.test.home_tasks.day3;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1. go to docuport
2. sign as adviser
3. store left navigate items to (Home, Received docs, My uploads, Invitations etc) to the List
4. iterate and print out href values
 */
public class Docuport2 {
@Test
        public void docuportTest () throws InterruptedException {
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

    //1. go to docuport app +
    DocuportUtils.login(DocuportConstants.CLIENT);
    Thread.sleep(1000);

    //3. store left navigate items to (Home, Received docs, My uploads, Invitations etc) to the List
//            List<WebElement> leftNavigateItems = driver.findElements(By.xpath("//a[contains(@class,'v-list-item')]"));

    //4. iterate and print out href values
//            for (WebElement each : leftNavigateItems) {
//               System.out.println((!each.getAttribute("href").isBlank()&&!each.getText().isBlank())?"href values of \""+each.getText()+ "\" button = " + each.getAttribute("href"):"");
//            }
//            driver.quit();



    String[] expected = {"Home", "Received docs", "My uploads", "Clients", "Invitations", "Users", "Leads", "Bookkeeping", "1099 Form", "Reconciliations"};

    List<WebElement> leftItems = driver.findElements(By.xpath("//a[contains(@class,'v-list-item')]"));

    String[] actual = new String[leftItems.size()];

    for (int i = 0 ; i< leftItems.size(); i++){
        actual[i] = leftItems.get(i).getText();
    }
    Assert.assertEquals(expected,actual);



//        List<String> ourItems = new ArrayList<>(Arrays.asList("Home", "Received docs","My uploads","Clients","Invitations","Users", "Leads" ,"Bookkeeping","1099 Form","Reconciliations"));
//
//            List<WebElement> leftItems = driver.findElements (By.xpath("//a[contains(@class,'v-list-item')]")) ;
//
//
//            for (int i = 0; i < leftItems.size(); i++) {
//               String actual = leftItems.get(i).getText();
//                String expected = ourItems.get(i);
//                Assert.assertEquals(actual,expected);
//            }







}

}


