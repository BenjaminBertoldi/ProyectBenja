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
    public void playerSelection (){
        Player pl1 = players.get(0);
        Player pl2 = players.get(3);
        Player pl3 = players.get(4);
        Player pl4 = players.get(5);
        Player pl5 = players.get(6);
        Player pl6 = players.get(10);
        Player pl7 = players.get(11);
        Player pl8 = players.get(12);
        Player pl9 = players.get(13);
        Player pl10 = players.get(19);
        Player pl11 = players.get(20);

        System.out.println("Players Selected");
        System.out.println(pl1.getFirstName()+pl1.getLastName()+pl1.getPosition());
        System.out.println(pl2.getFirstName()+pl2.getLastName()+pl2.getPosition());
        System.out.println(pl3.getFirstName()+pl3.getLastName()+pl3.getPosition());
        System.out.println(pl4.getFirstName()+pl4.getLastName()+pl4.getPosition());
        System.out.println(pl5.getFirstName()+pl5.getLastName()+pl5.getPosition());
        System.out.println(pl6.getFirstName()+pl6.getLastName()+pl6.getPosition());
        System.out.println(pl7.getFirstName()+pl7.getLastName()+pl7.getPosition());
        System.out.println(pl8.getFirstName()+pl8.getLastName()+pl8.getPosition());
        System.out.println(pl9.getFirstName()+pl9.getLastName()+pl9.getPosition());
        System.out.println(pl10.getFirstName()+pl10.getLastName()+pl10.getPosition());
        System.out.println(pl11.getFirstName()+pl11.getLastName()+pl11.getPosition());
    }

}



