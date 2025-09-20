package org.example.designptterns.builderpttern;

import java.util.Scanner;

public class userSelectService {
    public static String deathBenefit ="Death Benefit";
    public static String addDeathBen = "Additional Death Benefit";
    public static String allBenefit = "Death and Additional Death";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Welcome to insurance selection page");
        System.out.println("Kindly enter the sum Assured you looking for: ");
        long sumAssured = scanner.nextLong();
        System.out.println("expected duration in years: ");
        int duration = scanner.nextInt();
        System.out.println("Select Benefit, ex: 1, 2 or 3");
        System.out.println("1. "+deathBenefit);
        System.out.println("2. "+addDeathBen);
        System.out.println("3. "+allBenefit);
        int benefitOption = scanner.nextInt();
        String benefitsChosen;
        if (benefitOption == 1) benefitsChosen =deathBenefit;
        else if (benefitOption == 2) benefitsChosen = addDeathBen;
        else if (benefitOption == 3) benefitsChosen = allBenefit;
        else benefitsChosen = deathBenefit;
        System.out.println("How many members you want to cover ");
        int insuredMembers = scanner.nextInt();
        Insurnce searchingInsurance = new InsurnceBuilder().setSumAssured(sumAssured).setBenefits(benefitsChosen).setDuration(duration).setInsuredMembers(insuredMembers).getSearchingInsurance();
        System.out.println(searchingInsurance);
    }
}
