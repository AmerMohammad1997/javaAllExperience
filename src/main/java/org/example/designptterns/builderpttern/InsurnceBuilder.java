package org.example.designptterns.builderpttern;

public class InsurnceBuilder {
    private long sumAssured;
    private int duration;
    private String benefits;
    private int insuredMembers;

    public InsurnceBuilder setSumAssured(long sumAssured){
        this.sumAssured = sumAssured;
        return this;
    }

    public InsurnceBuilder setDuration(int duration){
        this.duration = duration;
        return this;
    }
    public InsurnceBuilder setBenefits(String benefits){
        this.benefits = benefits;
        return this;
    }
    public InsurnceBuilder setInsuredMembers(int insuredMembers){
        this.insuredMembers = insuredMembers;
        return this;
    }

    public Insurnce getSearchingInsurance(){
        return new Insurnce(sumAssured, duration, benefits, insuredMembers);
    };
}
