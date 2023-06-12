package team.players;

import team.TrainingStatistics;

public class Defence extends Player implements Hydration {
    private final double LEVEL_OF_HYDRATION_CRITIC = 0.2;
    private int habilityOfDefend = (int) (Math.random() * 10) + 1;
    private int ballDefended;

    public Defence(String firstName, String lastName, int age, int number, String position, int height, int weight,int ballDefended, PlayerStatistics playerStatistics, TrainingStatistics trainingStatistics,String emotions) {
        super(firstName, lastName, age, number, position, height, weight, playerStatistics, trainingStatistics,emotions);
        this.ballDefended = ballDefended;


    }

    public Defence(int ballDefended,int habilityOfDefend) {
        this.ballDefended = ballDefended;

    }

    public int getBallDefended() {
        return ballDefended;
    }

    public void setBallDefended(int ballDefended) {
        this.ballDefended = ballDefended;
    }

    @Override
    public String toString() {
        return "Defence" + super.toString();

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
    }



}
