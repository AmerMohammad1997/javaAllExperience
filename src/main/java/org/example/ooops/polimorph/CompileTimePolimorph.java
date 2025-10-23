package org.example.ooops.polimorph;

public class CompileTimePolimorph {
    public int sum(int a, int b){
        return (a+b);
    }
    public float sum(float a, float b, float c){
        return (a+b+c);
    }
    public int sum(int a, int b, int c){
        return (a+b+c);
    }

    public static void main(String[] args) {
        CompileTimePolimorph obj = new CompileTimePolimorph();
        System.out.println(obj.sum(1,3));
        System.out.println(obj.sum(1.4f,3,7));
        System.out.println(obj.sum(1,3,3));

    }
}
