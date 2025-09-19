package org.example.designptterns.factorypattern;

public class InsuranceFactory {
    public BaseInsurance startInsuranceProcess(Integer productCode){
        if (productCode == null) return null;
        if (productCode == 1000)return new LifeInsurance();
        else if (productCode == 2000)return new HealthInsurance();
        return null;
    }
}
