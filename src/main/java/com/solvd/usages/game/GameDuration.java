package com.solvd.usages.game;

public enum GameDuration {
    DURATION_90(90);

    private final int value;

    GameDuration(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
