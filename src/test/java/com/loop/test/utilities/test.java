package com.loop.test.utilities;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class test {
    @Test
    public void test() {
//      driver.get("https://loopcamp.vercel.app/web-tables.html");
//
//      String name = "Stewart Dawidson";
//
//      List<WebElement> list = driver.findElements(By.xpath("//td[.='"+name+"']/following-sibling::td"));
//List<String> alexandraList = new ArrayList<>();
//      for(int i=0;i< list.size();i++){
//         assertEquals(list.get(i).getText(),alexandraList.get(i));
//
//      }

        String str = "12xy34";
        String word = "xy";
        String str2 = "";
        System.out.println(str.indexOf(word));
        for (int i = 0; i < str.length(); i++) {
            int index = i;
            if (str.substring(index).indexOf(word) != i) {
                str2 += "+";

            } else {
                str2 += word;
                i += word.length() - 1;
            }
        }
        System.out.println(str2);


        System.out.println("----");


        String str5 = "aa11b33";

        String temp = "0";//"01"
        int total = 0; //11

        for (int i = 0; i < str5.length(); i++) {

            //"aa11b33"
            if (Character.isDigit(str5.charAt(i))) {//1
                temp += str5.charAt(i); //11


            } else {
                total += Integer.parseInt(temp);
                temp = "0";
            }

        }
        total += Integer.parseInt(temp);
        System.out.println(total);
        System.out.println("=====");
        int[] nums = new int[]{3, 1, 1, 3, 4, 4};
        ArrayList<Integer> list = new ArrayList<>();
      for(int each:nums) {
          list.add(each);
      }
            System.out.println(list);
            list.removeIf(n -> n == 4);
        System.out.println(list);

            int[] arr = new int[nums.length];

            int index = 0;

            for (Integer each : list) {
                if (each != 3) {
                    arr[index] = each;
                    index++;
                } else {
                    arr[index] = each;
                    index++;
                    arr[index] = 4;
                    index++;

                }
            }
        System.out.println(Arrays.toString(arr));

        }
    }

