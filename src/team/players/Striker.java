package team.players;

import team.TrainingStatistics;

public class Striker extends Player implements Hydration {
    private static final double LEVEL_OF_HYDRATION_CRITIC = 0.2;

    private int chanceOfGoals;


    public Striker(String firstName, String lastName, int age, int number, String position, int height, int weight,int chanceOfGoals, PlayerStatistics playerStatistics, TrainingStatistics trainingStatistics,String emotions) {
        super(firstName, lastName, age, number, position, height, weight, playerStatistics, trainingStatistics,emotions);
        this.chanceOfGoals = chanceOfGoals;
    }


    public Striker(int chanceOfGoals) {
        this.chanceOfGoals = chanceOfGoals;
    }

    public int getChanceOfGoals() {
        return chanceOfGoals;
    }

    public void setChanceOfGoals(int chanceOfGoals) {
        this.chanceOfGoals = chanceOfGoals;
    }

    @Override
    public String toString() {
        return "Striker: " + super.toString();
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
