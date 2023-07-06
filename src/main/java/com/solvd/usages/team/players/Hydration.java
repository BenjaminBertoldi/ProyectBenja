package com.solvd.usages.team.players;

public interface Hydration {
    double LEVEL_OF_HYDRATION_CRITIC = 0.2;
    double calculateHydration(int minutsplayed);

    void sendAlert();
}
