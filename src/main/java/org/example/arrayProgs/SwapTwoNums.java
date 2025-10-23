package org.example.arrayProgs;

public class SwapTwoNums {
    public static void main(String[] args) {
        int firstNum = 10;
        int secondNum = 20;

        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;
        System.out.println("firstNum"+firstNum + "secondNum"+secondNum);
    }
}
