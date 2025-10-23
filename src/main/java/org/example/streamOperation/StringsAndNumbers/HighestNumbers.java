package org.example.streamOperation.StringsAndNumbers;

import java.util.Arrays;
import java.util.Comparator;

public class HighestNumbers {
    public static void main(String[] args) {
        int[] arr = {5,30,5,2,7,8,5,3,3};
        System.out.println("Using Loop");
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (maxNum > arr[i]){
                maxNum = arr[i];
            }
        }
        System.out.println(maxNum);

        Integer maxVl = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("Using Stream"+maxVl);

        Integer secondHigh = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secondHigh"+secondHigh);

    }
}
