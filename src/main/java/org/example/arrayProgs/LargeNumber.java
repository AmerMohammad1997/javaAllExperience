package org.example.arrayProgs;

import java.util.Arrays;

public class LargeNumber {
    static int[] numbers = {12,45,23,6,7,455};

    public static int findLargeNumForLoop(){
        int max = numbers[0];
        for (int i = 0;i < numbers.length; i++){
            if (max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }
    public static int findLargeNumForEachLoop(){
        int largeNum = numbers[0];
        for (int i : numbers){
            if (i > largeNum){
                largeNum =i;
            }
        }
        return largeNum;
    }
    public static void main(String[] args) {
        System.out.println(findLargeNumForLoop());
        System.out.println(findLargeNumForEachLoop());
        System.out.println("Using Strem"+ Arrays.stream(numbers).max().orElseThrow());
    }
}
