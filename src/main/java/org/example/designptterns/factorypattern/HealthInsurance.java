package org.example.designptterns.factorypattern;

public class HealthInsurance implements BaseInsurance{
    @Override
    public void getInsurance() {
        System.out.println("You Selected Health insurance, Our Executive will connect you Shortly");
    }
}
