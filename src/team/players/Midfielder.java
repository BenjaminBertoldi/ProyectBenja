package team.players;

import team.TrainingStatistics;

public class Midfielder extends Player implements Hydration {


    private int sideline;

    public Midfielder(String firstName, String lastName, int age, int number, String position, int height, int weight,int sideline, PlayerStatistics playerStatistics, TrainingStatistics trainingStatistics,String emotions) {
        super(firstName, lastName, age, number, position, height, weight, playerStatistics, trainingStatistics,emotions);
        this.sideline = sideline;
    }

    public Midfielder(int sideline) {
        this.sideline = sideline;
    }

    public int getSideline() {
        return sideline;
    }

    public void setSideline(int sideline) {
        this.sideline = sideline;
    }

    public String showPosition(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Midfielder" +super.toString();
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
