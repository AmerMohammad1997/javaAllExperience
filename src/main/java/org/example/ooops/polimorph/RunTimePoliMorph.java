package org.example.ooops.polimorph;
// Run time polimorph
class Parent {
    public void printAge(int age){
        System.out.println("Your ge is " + age);
    }
}
class ChildClass extends Parent{
    public void printAge(int age){
        System.out.println("You are a child= age "+age);
    }
}
class GrandChild extends Parent{
    public void printAge(int age){
        System.out.println("You are a Grand child= age "+age);
    }
}

public class RunTimePoliMorph {
    public static void main(String[] args) {
        ChildClass childObj = new ChildClass();
        childObj.printAge(20);
    }
}
