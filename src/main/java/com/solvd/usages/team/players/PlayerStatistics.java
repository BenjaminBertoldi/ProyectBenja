package com.solvd.usages.team.players;

public class PlayerStatistics  {
    private int goals;
    private int assistences;
    private int correctPass;
    private int recovery;
    private int foul;
    private int yellowCard;
    private int redCard;
    private int corners;
    private int lateral;

    public PlayerStatistics(int goals, int assistences, int correctPass, int recovery, int foul, int yellowCard, int redCard) {
        this.goals = goals;
        this.assistences = assistences;
        this.correctPass = correctPass;
        this.recovery = recovery;
        this.foul = foul;
        this.yellowCard = yellowCard;
        this.redCard = redCard;
        this.corners = corners;
        this.lateral = lateral;
    }

    public int getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }

    public int getLateral() {
        return lateral;
    }

    public void setLateral(int lateral) {
        this.lateral = lateral;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssistences() {
        return assistences;
    }

    public void setAssistences(int assistences) {
        this.assistences = assistences;
    }

    public int getCorrectPass() {
        return correctPass;
    }

    public void setCorrectPass(int correctPass) {
        this.correctPass = correctPass;
    }

    public int getRecovery() {
        return recovery;
    }

    public void setRecovery(int recovery) {
        this.recovery = recovery;
    }

    public int getFoul() {
        return foul;
    }

    public void setFoul(int foul) {
        this.foul = foul;
    }

    public int getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(int yellowCard) {
        this.yellowCard = yellowCard;
    }

    public int getRedCard() {
        return redCard;
    }

    public void setRedCard(int redCard) {
        this.redCard = redCard;
    }

    @Override
    public String toString() {
        return "PlayerStatistics: " +
                "Goals: " + goals +
                " Assistences: " + assistences +
                " Correct Pass: " + correctPass +
                " Recovery: " + recovery +
                " Foul: " + foul +
                " Yellow Card: " + yellowCard +
                " Red Card: " + redCard ;
    }
}

