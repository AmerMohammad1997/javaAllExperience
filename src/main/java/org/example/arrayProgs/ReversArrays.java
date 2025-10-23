package org.example.arrayProgs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReversArrays {
    public static String reverseByLoop(int[] ints){
        for (int i = 0; i<ints.length;i++){
            for (int j = i+1; j<ints.length;j++){
                if(ints[i] > ints[j]){
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        return Arrays.toString(ints);
    }
    public static String reverseByLoopDevide(int[] ints){
        int index = ints.length-1;
        for (int i = 0; i< ints.length/2; i++){
            int temp = ints[i];
            ints[i] = ints[index-i];
            ints[index - i] = temp;
        }
        return Arrays.toString(ints);
    }
    public static void main(String[] args) {
        int[] ints = {2,5,4,3,7,9,10};
        System.out.println("Using norml Loop"+ reverseByLoop(ints));
        System.out.println("Using norml Loop"+ reverseByLoopDevide(ints));
        System.out.println("Using Collection");

        List<Integer> collect = Arrays.stream(ints).boxed().collect(Collectors.toList());
        Collections.reverse(collect);
        System.out.println(collect);
    }
}
