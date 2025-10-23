package org.example.streamOperation.StringsAndNumbers;

import java.util.Arrays;

public class LongWordAndNums {
    public static void main(String[] args) {
        String[] myArr = {"amer", "qwerty","typewriter"};
        String longString = Arrays.stream(myArr).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longString);
        
        String input = "my nme is khan typewriter";
        String longWord = Arrays.stream(input.split(" ")).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        
        int[] intArr = {2,4,6,8,34};
        int largeNum = Arrays.stream(intArr).reduce((val1, val2) -> val1 > val2 ? val1 : val2).getAsInt();
        System.out.println("using reduce"+largeNum);
        int longNum = Arrays.stream(intArr).max().orElseThrow();
        System.out.println("using max"+ longNum);

    }
}
