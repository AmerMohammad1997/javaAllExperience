package org.example.streamOperation.mapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ECartDatabse {
    public static List<Customer> getAllCustomer(){
        return Stream.of(
                new Customer(101,"Amer","Amer@gmail.com", Arrays.asList("1234567890","4567890")),
                new Customer(101,"Raj","Amer@gmail.com", Arrays.asList("000000000","2222222")),
                new Customer(101,"Kir","Amer@gmail.com", Arrays.asList("4444444","5555555")),
                new Customer(101,"SKfsd","Amer@gmail.com", Arrays.asList("8888888899","999999"))
        ).collect(Collectors.toList());
    }
}
