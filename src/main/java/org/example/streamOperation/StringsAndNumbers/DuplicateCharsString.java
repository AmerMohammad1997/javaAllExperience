package org.example.streamOperation.StringsAndNumbers;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharsString {
    public static void main(String[] args) {
        String input = "quickbrownfox";
        Map<String, Long> eachChar = Arrays.stream(input.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println("count of each char"+eachChar);

        List<String> duplicateChars = eachChar.entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println("Duplicate chars"+duplicateChars);

        List<String> uniqueChars = eachChar.entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).toList();
        System.out.println("uniqueChars chars"+uniqueChars);

        String firstUniqueCHr = Arrays.stream(input.split("")).collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
        System.out.println("firstUniqueCHr chars"+firstUniqueCHr);


        System.out.println("numbers first duplicte number");
        int[] arr = {5,5,3,5,2,7,8,5,3,3};
        Map.Entry<Integer, Long> integerLongEntry = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).findFirst().get();
        System.out.println(integerLongEntry);
    }
}
