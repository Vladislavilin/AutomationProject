package com.loop.test.home_tasks.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hjk {
    public static void addToInt(int x, int amountToAdd) {
            x = x + amountToAdd;
           }

    public static void main(String[] args) {
        int a = 15;
            int b = 10;
        System.out.println();
          System.out.println(a);

        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        System.out.println(list);
        list.add(array[2]);
        System.out.println(list);
        list.set(1, array[1]);
        System.out.println(list);
        list.remove(0);

        System.out.println(list);


       String str = "string";
       String str2 = str.substring(0,0);
        System.out.println(str2);

        int [] arr = {1,2,3,4,5,6};
        int [] arr1 = new int[] {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        int x = 5, j = 0;

           for(int i=0; i<10; ) //  i =2,
                do {
                  i++; x++; // i ==3, x ==12
                   if(x > 10) break ;
                   x += 4; //x ==10
                   j++; // j=1
                 } while(j <= 2);
            System.out.println(x);

        int i = 10;
           if((i>10 ? i++: --i)<10) {
                   System.out.print("Foo");
                } if(i<10) System.out.print("Bar");













    }
}
