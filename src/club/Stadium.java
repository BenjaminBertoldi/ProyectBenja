package club;

import UIMenu.Uimenu;
import people.People;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Stadium {
    private int availableSeatPremium;
    private int availableSeatGeneral;
    private int seatPremium;
    private int seatGeneral;
   private Field field ;
   private Date dateFoLastMaintenace;
   private String teamOfMaintenance;


    public int getSeatPremium() {
        return seatPremium;
    }

    public Stadium(int seatPremium, int seatGeneral) {
        this.seatPremium = seatPremium;
        this.seatGeneral = seatGeneral;
        this.availableSeatGeneral = seatGeneral;
        this.availableSeatPremium = seatPremium;
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
        teamOfMaintenance = "Maintenace";
        dateFoLastMaintenace = new Date();

        if(needMaintenance()){
            System.out.println("The Team " + teamOfMaintenance + " Need Maintenace.");
            registreMaintenace();
            System.out.println("Maintenace registred to team: " + teamOfMaintenance + ".");
        }else {
            System.out.println("The Team " + teamOfMaintenance + " Dont need maintenace. ");
        }
    }
    public boolean needMaintenance(){
        Date currentDate = new Date();

        long diferenceOfTime = currentDate.getTime() - dateFoLastMaintenace.getTime();

        long daysPassed = diferenceOfTime / (24 * 60 * 60 * 1000 );
        return daysPassed < 30;
    }
    public void registreMaintenace(){
        dateFoLastMaintenace = new Date();

        System.out.println("Make maintenace of team: " + teamOfMaintenance + ".");
        System.out.println("Check Plases of Stadium");
        System.out.println("Clean Plases of Stadium");
        System.out.println("Cut grass of Field " + field);
        System.out.println("Remplase All the light bulb burned");
    }

}
