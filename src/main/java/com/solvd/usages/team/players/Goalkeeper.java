package com.solvd.usages.team.players;

import com.solvd.usages.team.TrainingStatistics;

public class Goalkeeper extends Player implements Hydration {

    private int interruptions;


    public Goalkeeper(String firstName, String lastName, int age, int number, String position, int height, int weight, int interruptions, PlayerStatistics playerStatistics, TrainingStatistics trainingStatistics, String emotions ) {
        super(firstName, lastName, age, number, position, height, weight, playerStatistics, trainingStatistics,emotions);
        this.interruptions = interruptions;

    }

    public Goalkeeper(int interruptions) {
        this.interruptions = interruptions;
    }

    public int getInterruptions() {
        return interruptions;
    }

    public void setInterruptions(int interruptions) {
        this.interruptions = interruptions;
    }

    @Override
    public String toString() {
        return "Goalkeeper: "  + super.toString() ;
    }

    @Override
    public double calculateHydration(int minutsPayed){
        double hidrationStarting = 1.0;
        double reductionForMinuts = 0.01;
        double hidrationActually  = hidrationStarting - (minutsPayed * reductionForMinuts);
        if (hidrationActually < 0){
            hidrationActually = 0;
        }
        return hidrationActually;
    }
    @Override
    public void sendAlert(){
        double hidrationActually = calculateHydration(0);
        if (hidrationActually <= LEVEL_OF_HYDRATION_CRITIC){
            System.out.println("Water boy delivered a bottle");
        }
}}
