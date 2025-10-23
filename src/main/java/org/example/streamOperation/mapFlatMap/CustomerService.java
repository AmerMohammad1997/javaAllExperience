package org.example.streamOperation.mapFlatMap;

import java.util.List;

public class CustomerService {
    public static void main(String[] args) {
        List<Customer> customer = ECartDatabse.getAllCustomer();
        List<String> emilsMap = customer.stream().map(Customer::getEmailId).toList();
        System.out.println("emils usig Map "+emilsMap);

        List<String> emailByMap = customer.stream().map(x -> x.getEmailId()).toList();
        System.out.println("emils using Map "+emailByMap);

        List<String> mobileFlatMap = customer.stream().flatMap(x -> x.getPhoneNumbers().stream()).toList();
        System.out.println("mobile using FlatMap "+mobileFlatMap);

    }
}
