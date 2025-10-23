package org.example.streamOperation.StringsAndNumbers;

interface Calculator{
    float substract(int val1, int val2);
}
public class FunctiolLambda {
    public static void main(String[] args) {
        Calculator cals = (val1, val2) -> {
            System.out.println("val1:" + val1 + ", val2: "+val2);
            if (val1 < val2){
                System.out.println("first valu should be greter");
                return 0;
            }
            return val1 - val2;};
        System.out.println(cals.substract(12,3));
    }
}
