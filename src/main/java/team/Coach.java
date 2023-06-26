package team;

import club.Club;
import club.Team;
import people.People;

public class Coach extends People {
    private int chagesRealized;

    public Coach(String firstName, String lastName, int age, int chagesRealized) {
        super(firstName, lastName, age);
        this.chagesRealized = chagesRealized;
    }

    public Coach() {}

    public int getChagesRealized() {
        return chagesRealized;
    }

    public void setChagesRealized(int chagesRealized) {
        this.chagesRealized = chagesRealized;
    }

    @Override
    public String toString() {
        return "Coach: " + super.toString() +
                " Changes Realized: " + chagesRealized ;
    }
    public void trainingRutine(){
        String[] weekDays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        for (int i = 0; i < weekDays.length; i++){
            System.out.println("Training of " + weekDays[i] + ":");
            switch (i){
                    case 0:
                    System.out.println("Game Day");
                    break;
                    case 1:
                    System.out.println("Passive Recovery Subdynamics");
                    System.out.println("The main objective is the mental and psychological recovery of the player.");
                    break;
                    case 2:
                    System.out.println("Active recovery subdynamics");
                    System.out.println("The main objective is the physiological recovery of the player, but without forgetting the game model");
                    System.out.println("being able to apply here the correction of tactical errors produced during the match.");
                    break;
                    case 3:
                        System.out.println("Tension subdynamics");
                        System.out.println("Game model: Sub-principles at the level of sectoral and intersectoral relations.");
                        System.out.println("Small space\n");
                    break;
                    case 4:
                    System.out.println("Duration subdynamics");
                    System.out.println("Game model: great principles (collective team dynamics).");
                    System.out.println("Big space\n");
                    break;
                    case 5:
                    System.out.println("Speed subdynamics");
                    System.out.println("Game model: sub-principles at the sectoral level, although it can also work at an intersectoral or collective level.");
                    System.out.println("Medium space\n");
                    break;
                    case 6:
                    System.out.println("Activation subdynamics");
                    break;
            }
            System.out.println();
        }
    }
    public void defensiveStrategy(){
        System.out.println("Defencive Strategy of Tovichas Club:");
        System.out.println();
        System.out.println("- Put up a solid and compact defensive line.");
        System.out.println("- Press the opposing player who has the ball.");
        System.out.println("- Closely mark the key players of the opposing team.");
        System.out.println("- Perform defensive coverage to avoid free spaces.");
        System.out.println("- Intercept passes and cut the passing lanes of the opposing team.");
    }
    public void offenciveStrategy(){
        System.out.println("Offencive Strategy to Tovichas Club:");
        System.out.println();
        System.out.println("- Maintain good ball possession and control of the game.");
        System.out.println("- Make constant movements to create spaces and passing options.");
        System.out.println("- Execute fast and precise combinations between the players.");
        System.out.println("- Use unmaking and changes of pace to destabilize the opposing defense.");
        System.out.println("- Attack on the wings and center the ball towards the goal area.");
        System.out.println("- Take shots from a distance and look for opportunities to finish off on goal.");
        System.out.println("- Perform rehearsed plays in free kicks and corners.");
        System.out.println("- Seek collaboration and coordination between the players in the attack.");
    }
}
