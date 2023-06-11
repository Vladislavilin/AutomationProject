package com.loop.test.utilities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
    public static void main(String[] args) {
        String[] things = {"house", "shed", "slide",
                "zebra", "park", "garden"};
        for (String s : things) {

            switch (s.charAt(1)) {
                case 'h':
                    System.out.print(1);
                    break; // o , h, l, e, a, a // 451452323
                case 'a':
                    System.out.print(2);
                case 's':
                    System.out.print(3);
                    break;
                case 'o':
                    break;
                default:
                    System.out.print(4);
                case 'p':
                    System.out.print(5);
                    break;
                case 'z':
                    System.out.print(6);
                case 'l':
                    break;
                case 'g':
                    System.out.print(7);
            }
        }

    }
//        LoopCampVerselUtil.loopCampPractice("add-remove-elements");
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
