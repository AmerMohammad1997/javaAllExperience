package org.example.streamOperation.StringsAndNumbers;

import java.util.Arrays;

public class SumOfIntArray {
    public static void main(String[] args) {
        int[] intArr = {1,123,34,3456,5452,15234};
        Integer sumResult = Arrays.stream(intArr).boxed().reduce(0, (a, b) -> a+b);
        System.out.println(sumResult);
    }
}
