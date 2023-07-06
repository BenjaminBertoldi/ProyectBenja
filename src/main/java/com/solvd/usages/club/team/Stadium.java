package com.solvd.usages.club.team;

import com.solvd.usages.people.People;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Stadium implements Weather {

    private int availableSeatPremium;
    private int availableSeatGeneral;
    private int seatPremium;
    private int seatGeneral;
   private Field field ;
   private Date dateFoLastMaintenace;
   private Random random;
   private List<People> teamOfMaintenance;


    public int getSeatPremium() {
        return seatPremium;
    }

    public Stadium(int seatPremium, int seatGeneral,Field field) {
        this.seatPremium = seatPremium;
        this.seatGeneral = seatGeneral;
        this.availableSeatGeneral = seatGeneral;
        this.availableSeatPremium = seatPremium;
        this.field = field;
        this.random = new Random();
    }

    public List<People> getTeamOfMaintenance() {
        return teamOfMaintenance;
    }

    public void setTeamOfMaintenance(List<People> teamOfMaintenance) {
        this.teamOfMaintenance = teamOfMaintenance;
    }

    public Date getDateFoLastMaintenace() {
        return dateFoLastMaintenace;
    }

    public void setDateFoLastMaintenace(Date dateFoLastMaintenace) {
        this.dateFoLastMaintenace = dateFoLastMaintenace;
    }

    public void setSeatPremium(int seatPremium) {
        this.seatPremium = seatPremium;
    }

    public int getSeatGeneral() {
        return seatGeneral;
    }

    public void setSeatGeneral(int seatGeneral) {
        this.seatGeneral = seatGeneral;
    }

    public int getAvailableSeatPremium() {
        return availableSeatPremium;
    }

    public void soldAvailableSeatPremium(int quantity) {
        if(quantity > this.availableSeatPremium){
            System.out.println("there is no available seat premium at the moment");
        }else {
            System.out.println("purchase completed");
            this.availableSeatPremium =this.availableSeatPremium - quantity;
        }

    }

    public int getAvailableSeatGeneral() {
        return availableSeatGeneral;
    }

    public void soldAvailableSeatGeneral(int quantity) {
        if (quantity >this.availableSeatGeneral){
            System.out.println("there is no available seat general at the moment");
        }else {
            System.out.println("purchace completed");
            this.availableSeatGeneral =this.availableSeatGeneral- quantity;
        }
    }



    @Override
    public String toString() {
        return "Stadium" +
                " Seat Premium: " + seatPremium +
                " Seat General: " + seatGeneral +
                " Available Seat Premium: " + availableSeatPremium +
                " Available Seat General: " + availableSeatGeneral;
    }
    public void controlOfMaintenace(){
        if(needMaintenance()){
            DayOfWeek currentDayOfWeek = getCurrentDatOfWeek();
            System.out.println("The Team: " + teamOfMaintenance + " is working.");
            registreMaintenace(currentDayOfWeek);
            System.out.println("Maintenace registred to team: " + teamOfMaintenance + ".");
        }else {
            System.out.println(" Dont need maintenace. ");
        }
    }
    public boolean needMaintenance(){
        Calendar currentDate = Calendar.getInstance();
        Calendar lastMaintenanceDate = Calendar.getInstance();
        lastMaintenanceDate.setTime(dateFoLastMaintenace);

        int daysPassed = currentDate.get(Calendar.DAY_OF_YEAR) - lastMaintenanceDate.get(Calendar.DAY_OF_YEAR);
        return daysPassed >= 30;
    }
    public void registreMaintenace(DayOfWeek maintenanceDay){
        dateFoLastMaintenace = new Date();


        System.out.println("Check Plases of Stadium");
        System.out.println("Clean Plases of Stadium");
        System.out.println("Cut grass of Field " + field);
        System.out.println("Remplase All the light bulb burned");
        System.out.println("Maintenace Made for: " + teamOfMaintenance + " on " + maintenanceDay + ".");
    }

    private DayOfWeek getCurrentDatOfWeek(){
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek){
            case Calendar.MONDAY:
                return DayOfWeek.MONDAY;
            case Calendar.TUESDAY:
                return DayOfWeek.TUESDAY;
            case Calendar.WEDNESDAY:
                return DayOfWeek.WEDNESDAY;
            case Calendar.THURSDAY:
                return DayOfWeek.THURSDAY;
            case Calendar.FRIDAY:
                return DayOfWeek.FRIDAY;
            case Calendar.SATURDAY:
                return DayOfWeek.SATURDAY;
            case Calendar.SUNDAY:
                return DayOfWeek.SUNDAY;
            default:
                throw new IllegalStateException("Invalid day of week: " + dayOfWeek );
        }
    }

    public String getWeather(){
        String[] weaters = {"Cloudy","Sunny","Rainy"};
        int index = random.nextInt(weaters.length);
        return weaters[index];
    }


}
