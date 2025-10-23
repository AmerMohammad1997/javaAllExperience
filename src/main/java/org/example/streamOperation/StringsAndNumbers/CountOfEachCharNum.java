package org.example.streamOperation.StringsAndNumbers;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfEachCharNum {
    public static void main(String[] args) {
        String input = "quick brown fox jumps over a lazy";
        Map<String, Long> stringCount = Arrays.stream(input.split(" ")).filter(x -> !x.equals("")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(stringCount);

        int[] arr = {1,3,4,6,7,8,3,4,5,4,8};
        Map<Integer, Long> intCount = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(intCount);
    }

}
