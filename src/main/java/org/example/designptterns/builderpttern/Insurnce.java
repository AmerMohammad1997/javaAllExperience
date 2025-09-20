package org.example.designptterns.builderpttern;

public class Insurnce {
    private long sumAssured;
    private int duration;
    private String benefits;
    private int insuredMembers;

    public Insurnce( long sumAssured, int duration, String benefits,int insuredMembers){
        super();
        this.sumAssured = sumAssured;
        this.duration = duration;
        this.benefits = benefits;
        this.insuredMembers = insuredMembers;
    }

    public String toString(){
        return "You are Searching insurance for sum Assured: "+sumAssured+", duration : "+duration+", benefits: ["+benefits+"], for "+insuredMembers+" members";
    }
}
