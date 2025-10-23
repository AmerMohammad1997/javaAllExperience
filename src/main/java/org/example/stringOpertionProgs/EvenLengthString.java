package org.example.stringOpertionProgs;

import java.util.*;
import java.util.stream.Collectors;

public class EvenLengthString {
    public static void getEvenLengthString(String givenString){
        for (String str : givenString.split(" ")){
            if (str.length() % 2 ==  0){
                System.out.println(str);
            }
        }
    }

    public static List<String> getEvenStringByColl(String givenString){
        List<String> myList = new ArrayList<>();
        for (String str : givenString.split(" ")){
            if (str.length() % 2 == 0){
                myList.add(str);
            }
        }
        return myList;
    }
    public static void main(String[] args) {
        String givenString = "this is given String to check";
        System.out.println("Using Loop and String: ");
        getEvenLengthString(givenString);

        System.out.println("Using Collection");
        List<String> evenStringByColl = getEvenStringByColl(givenString);
        for (String str : evenStringByColl){
            System.out.println(str);
        }

        System.out.println();
        System.out.println("Using Stream");
        Arrays.stream(givenString.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream().filter( x-> x.getKey().length() % 2 == 0).forEach(x -> System.out.println(x.getKey()));

        System.out.println("========");
        Map<String, Long> collect = Arrays.stream(givenString.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(collect);
    }
}
