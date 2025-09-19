package org.example.designptterns.factorypattern;

public class LifeInsurance implements BaseInsurance{
    @Override
    public void getInsurance() {
        System.out.println("You selected Life Insurnce, Our agent will connect with you");
    }
}
