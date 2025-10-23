package org.example.stringOpertionProgs;

public class StringPlindromeAndReverse {
    public static String reverseString(String input){
        String result = "";
        for (int i = 0; i< input.length(); i++){
            result += input.charAt(i)+result;
        }
        return result;
    }
    public static void main(String[] args) {
        String original = "tenet";
        String reversedString = reverseString(original);
        System.out.println("original : "+original);
        System.out.println("reversed : "+ reversedString);
        if (reversedString.equalsIgnoreCase(original)){
            System.out.println(original + " is plindrome");
        }else{
            System.out.println(original+ " is not palindrome");
        }
    }
}
