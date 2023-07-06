package com.solvd.usages.game;

public class  Die {
    private final int GAME_DURATION = 90;
    private final int DICE_INTERVAL = 2;
    private int numbrerFaces = 6;


    public Die(int numbrerFaces) {
        this.numbrerFaces = numbrerFaces;

    }

    public  Die() {
    }

    public int getGAME_DURATION() {
        return GAME_DURATION;
    }

    public int getDICE_INTERVAL() {
        return DICE_INTERVAL;
    }

    public int getNumbrerFaces() {
        return numbrerFaces;
    }

    public void setNumbrerFaces(int numbrerFaces) {
        this.numbrerFaces = numbrerFaces;
    }

    public int throwDie(){
        return this.generateRandomNumbers(1,this.numbrerFaces);

    }

    private int generateRandomNumbers(int minimo,int maximo){
        return (int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
    }


}
