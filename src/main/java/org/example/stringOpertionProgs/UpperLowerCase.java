package org.example.stringOpertionProgs;

public class UpperLowerCase {
    public static String toLower(String given){
        String result = "";
        for (int i = 0; i < given.length(); i++){
            char ch = given.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }
    public static String toUpper(String given){
        String result = "";
        for (int i = 0; i < given.length(); i++){
            char ch = given.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                ch = (char) (ch -32 );
            }
            result += ch;
        }
        return result;

    }
    public static void main(String[] args) {
        String given = "Hello AmmeR";
        System.out.println(toLower(given));
        System.out.println(toUpper(given));
    }
}
