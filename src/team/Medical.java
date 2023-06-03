package team;

import people.People;
import team.players.Player;

import java.util.ArrayList;
import java.util.List;



public class Medical extends People {

    private String speciality;

    public Medical(String firstName, String lastName, int age, String speciality) {
        super(firstName, lastName, age);
        this.speciality = speciality;
    }

    public Medical() {
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "\n" + "Medical: " + "\n" +
                super.toString() +
                " speciality: " + speciality ;
    }
    public void playersEmotions(ArrayList<Player> players){
        for (Player player : players){
            System.out.println("Player: " +player.getFirstName()+player.getLastName() + " Emotion Status: " + player.getEmotions() );
        }

    }

}
