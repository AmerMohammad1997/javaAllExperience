package org.example.streamOperation.StringsAndNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {
    public static void main(String[] args) {
        int[] intArr = {1,123,34,3456,5452,15234};
        List<String> starts1 = Arrays.stream(intArr).boxed().map(x-> x+"").filter(x -> x.startsWith("1")).collect(Collectors.toList());
        System.out.println(starts1);
        String[] myArr = {"amer", "qwerty","typewriter"};
        List<String> startsA = Arrays.stream(myArr).filter(x -> x.startsWith("a")).toList();
        System.out.println("Using Stream"+ startsA);

        System.out.println();
        System.out.println("Using For Loop");
        for (String str: myArr){
            if (str.startsWith("r")){
                System.out.println(str);
            }
        }

        System.out.println();
        System.out.println("Without inbuilt");
        for (String str: myArr){
            if (str.charAt(0) == 'r'){
                System.out.println(str);
            }
        }
    }
}
