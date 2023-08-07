package com.solvd.usages.team.players;

import com.solvd.usages.people.People;
import com.solvd.usages.team.TrainingStatistics;

public class Player extends People implements Actions {
    private int id;
    private int number;
    private String position;
    private int height;
    private int weight;
    private int salary;
    private PlayerStatistics statistics;
    private TrainingStatistics trainingStatistics;
    private int hoursOfTraining;
    private String emotions;

    public Player(String firstName, String lastName, int age, int number, String position, int height, int weight, PlayerStatistics playerStatistics, TrainingStatistics trainingStatistics,String emotions) {
        super(firstName, lastName, age);
        this.number = number;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.statistics = playerStatistics;
        this.trainingStatistics = trainingStatistics;
        this.hoursOfTraining = 0;
        this.emotions = emotions;

    }

    public Player() {
        super();
    }

    public String getEmotions() {
        return emotions;
    }

    public void setEmotions(String emotions) {
        this.emotions = emotions;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public String  getStatistics() {
        return statistics.toString();
    }

    public String getTrainingStatistics(){
        return this.trainingStatistics.toString();
    }

    public void setStatistics(PlayerStatistics statistics) {
        this.statistics = statistics;
    }

    public void setTrainingStatistics(TrainingStatistics trainingStatistics){ this.trainingStatistics = trainingStatistics; }

    public int getHoursOfTraining() {
        return hoursOfTraining;
    }

    public void setHoursOfTraining(int hoursOfTraining) {
        this.hoursOfTraining = hoursOfTraining;
    }
    public void addHoursOfTraining(int hours){
        hoursOfTraining += hours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Players" + "\n" +
                super.toString() +
                " - Number: " + number +
                " - Position: " + position +
                " - Height: " + height + " Cm " +
                " - Weight: " + weight + " Kg - ";
    }
    public void pass(){
       statistics.setCorrectPass(statistics.getCorrectPass() +1);
    }
    public void foul(){
        statistics.setFoul(statistics.getFoul() +1);
    }
    public void corners(){
        statistics.setCorners(statistics.getCorners() +1);
    }
    public void lateral(){
        statistics.setLateral(statistics.getLateral() +1);
    }
    public void assistence(){
        statistics.setAssistences(statistics.getAssistences() +1);
    }
    public void setgoal(){
        statistics.setGoals(statistics.getGoals() +1);
    }


}
