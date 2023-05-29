package club;

import UIMenu.Uimenu;
import game.Die;
import team.Coach;
import team.MedicalTeam;
import team.TeamStatistics;
import team.players.Player;

import java.util.List;

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

public static void training (){
    Uimenu.createTeam().getPlayers();
    Player p1 = players.get(0);
    p1.addHoursOfTraining(3);

    Player p2 = players.get(1);
    p2.addHoursOfTraining(2);

    Player p3 = players.get(2);
    p3.addHoursOfTraining(4);

    Player p4 = players.get(3);
    p4.addHoursOfTraining(1);

    Player p5 = players.get(4);
    p5.addHoursOfTraining(5);

    Player p6 = players.get(5);
    p6.addHoursOfTraining(3);

    Player p7 = players.get(6);
    p7.addHoursOfTraining(2);

    Player p8 = players.get(7);
    p8.addHoursOfTraining(4);

    Player p9 = players.get(8);
    p9.addHoursOfTraining(1);

    Player p10 = players.get(9);
    p10.addHoursOfTraining(5);

    Player p11 = players.get(10);
    p11.addHoursOfTraining(3);

    Player p12 = players.get(11);
    p12.addHoursOfTraining(2);

    Player p13 = players.get(12);
    p13.addHoursOfTraining(4);

    Player p14 = players.get(13);
    p14.addHoursOfTraining(1);

    Player p15 = players.get(14);
    p15.addHoursOfTraining(5);

    Player p16 = players.get(15);
    p16.addHoursOfTraining(3);

    Player p17 = players.get(16);
    p17.addHoursOfTraining(2);

    Player p18 = players.get(17);
    p18.addHoursOfTraining(4);

    Player p19 = players.get(18);
    p19.addHoursOfTraining(1);

    Player p20 = players.get(19);
    p20.addHoursOfTraining(5);

    Player p21 = players.get(20);
    p21.addHoursOfTraining(5);

    Player p22 = players.get(21);
    p22.addHoursOfTraining(5);

    for (Player player : players){
        System.out.println("Player: " +player.getFirstName()+player.getLastName() + " Hours of Training: " + player.getHoursOfTraining() );
    }


}
}

