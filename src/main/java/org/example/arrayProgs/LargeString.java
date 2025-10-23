package org.example.arrayProgs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class LargeString {
    public static String longString(String[] arr){
        String s = Arrays.stream(arr).max(Comparator.comparingInt(String::length)).get();
        return s;
    }
    public static void main(String[] args) {
        String[] arr = {"amer", "mohammad","qwerty"};
        System.out.println("Using  normal for loop");
        String lonString = arr[0];
        for (int i = 0; i< arr.length;i++){
            if (lonString.length() <arr[i].length()){
                lonString = arr[i];
                arr[i] = lonString;
            }
        }
        System.out.println(lonString);



        String longString = "";
        for (String str : arr){
            if (str.length() > longString.length()){
                longString = str;
            }
        }
        System.out.println("Using for each"+longString);


        System.out.println("Using method and stream:");
        System.out.println(longString(arr));


        System.out.println("2 long strings");
        String[] twoStr = Arrays.stream(arr).sorted(Comparator.comparingInt(String::length).reversed()).limit(2).toArray(String[]::new);
        for (String str : twoStr){
            System.out.println(str);
        }


    }
}
