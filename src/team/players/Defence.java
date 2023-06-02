package team.players;

import team.TrainingStatistics;

public class Defence extends Player {
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


}
