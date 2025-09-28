package org.example.stringOpertionProgs;

import java.util.Scanner;

public class AddSymbolInString {
    public static String addSymbol(String givenString, char symbol, int position){
        String result = "";
        for(int i = 0; i<givenString.length();i++){
            if ((i + 1) % position == 0){
                result += symbol;
            }
            else {
                result += givenString.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text or String to modify : ");
        String givenString = scan.nextLine();
        System.out.println("Enter a symbol or char to add in even : ");
        char symbol = scan.next().charAt(0);
        System.out.println("Enter which position you want to print this symbol");
        int position = scan.nextInt();
        System.out.println(addSymbol(givenString, symbol, position));
        scan.close();
    }
}
