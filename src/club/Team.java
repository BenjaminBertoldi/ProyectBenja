package club;

import UIMenu.Uimenu;
import game.Die;
import team.Coach;
import team.MedicalTeam;
import team.TeamStatistics;
import team.players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String teamName;
    private TeamStatistics teamStatistics;
    private static List<Player> players;
    private MedicalTeam medicals;
    private Coach coach;

    public Team(String teamName, TeamStatistics teamStatistics, MedicalTeam medicals,Coach coach,List<Player> players) {
        this.teamName = teamName;
        this.teamStatistics = teamStatistics;
        this.medicals = medicals;
        this.coach = coach;
        this.players = players;
    }

    public Team() {
    }
    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public TeamStatistics getTeamStatistics() {
        return teamStatistics;
    }

    public void setTeamStatistics(TeamStatistics teamStatistics) {
        this.teamStatistics = teamStatistics;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public MedicalTeam getMedicals() {
        return medicals;
    }

    public void setMedicals(MedicalTeam medicals) {
        this.medicals = medicals;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "Team" +
                "teamName: " + teamName + '\'' +
                " teamStatistics: " + teamStatistics +
                " players: " + players +
                " medicals: " + medicals +
                "Coach: " + coach ;
}
public int throwdice(Die d){
        return d.throwDie();
}

public void training (){

        for (Player player : players){
        int random = new Random().nextInt(5 - 1) + 1;
        player.addHoursOfTraining(random);
        System.out.println("Player: " +player.getFirstName()+player.getLastName() + " Hours of Training: " + player.getHoursOfTraining() );
    }
    }
    public List<Player> playerSelection (int[] playerIndex){
        List<Player> elevenInTheGame = new ArrayList<>();

        System.out.println("Players selected");
        for (int i = 0; i<playerIndex.length; i++){
            Player player = players.get(playerIndex[i]);
            elevenInTheGame.add(player);

        }
        return elevenInTheGame;
    }

}



