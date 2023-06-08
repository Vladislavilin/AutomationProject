package com.loop.test.day9_driver_faker_actions;

import com.github.javafaker.Faker;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T6_registration_form {

    @Test
    public void registration_form_test(){
        Faker faker = new Faker();
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        Driver.getDriver().findElement(By.xpath("//a[.='Registration Form']")).click();

        Driver.getDriver().findElement(By.xpath("//input[@name='firstname']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input[@name='lastname']")).sendKeys(faker.name().lastName());
        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(faker.bothify("???###"));


        Driver.getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys(faker.internet().emailAddress());

        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(faker.internet().password());
    Driver.getDriver().findElement(By.xpath("//input[@name='phone']")).sendKeys(faker.numerify("571-###-####"));
    Driver.getDriver().findElement(By.xpath("//input[@value='other']")).click();
    Driver.getDriver().findElement(By.xpath("//input[@name='birthday']")).sendKeys(faker.numerify("##/##/####"));









        //input[@name='password']

    }
}
