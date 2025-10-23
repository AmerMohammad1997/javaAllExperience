package org.example.arrayProgs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {

    public static List<Integer> missingList(int[] givenVal){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i: givenVal){
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Min: "+ min+", Max: "+max);
        Set<Integer> presentSet = new HashSet<>();
        for (int i : givenVal){
            presentSet.add(i);
        }
        List<Integer> missingList = new ArrayList<>();
        for (int i = min; i<= max; i++){
            if (!presentSet.contains(i)){
                missingList.add(i);
            }
        }
        return missingList;
    }
    public static void main(String[] args) {
        int[] givenVal = {2,4,6,8,3,5,6,6,10};
        System.out.println("Using Loop"+missingList(givenVal));

        System.out.println("Using Stream");
        int max = Arrays.stream(givenVal).max().orElseThrow();
        int min = Arrays.stream(givenVal).min().orElseThrow();
        Set<Integer> presntSet = Arrays.stream(givenVal).boxed().collect(Collectors.toSet());
        List<Integer> missngNums = IntStream.rangeClosed(min, max).filter(x -> !presntSet.contains(x)).boxed().toList();
        System.out.println(missngNums);
    }
}
