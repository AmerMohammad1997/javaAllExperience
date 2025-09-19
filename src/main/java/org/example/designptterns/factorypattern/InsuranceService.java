package org.example.designptterns.factorypattern;

import java.util.Scanner;

public class InsuranceService {
    public static String lifeProductText = "1. Life Insurance";
    public static String healthProduct = "2. Health Insurance";
    public static int productCode;
    public static int selectedProduct(Integer productId){
        if (productId == 1){
            productCode = 1000;
            System.out.println("You have selected "+lifeProductText);
        }
        if (productId == 2){
            productCode = 2000;
            System.out.println("You have selected "+healthProduct);
        }
        return productCode;
    }
    public static void main(String[] args) {
        InsuranceFactory insuranceFactory = new InsuranceFactory();

        Scanner scan = new Scanner(System.in);
        System.out.println("Hi Customer Please enter Your name");
        String userName = scan.nextLine();
        System.out.println("Welcome "+userName+ ";");
        System.out.println("We have the following Insurances");
        System.out.println("Select Any product you like : -");
        System.out.println("--------------------------------");
        System.out.println(lifeProductText);
        System.out.println(healthProduct);
        System.out.println("enter q to exit");
        System.out.println("--------------------------------");
        int productId = scan.nextInt();
        int selectedProductCode = selectedProduct(productId);
        BaseInsurance baseInsurance = insuranceFactory.startInsuranceProcess(selectedProductCode);
        baseInsurance.getInsurance();


    }
}
