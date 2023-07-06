package com.solvd.usages.team.players;

public enum MaxPlayers {
    MAX_11(11);
    private final int value;

    MaxPlayers(int value){
        this.value = value;
    }
    public int getValue() {
        return value;
    }


}
