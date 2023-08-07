package com.solvd.usages.club.team;

import com.solvd.conexion.conexion;
import com.solvd.usages.people.People;
import com.solvd.usages.people.User;

import java.sql.PreparedStatement;

public class Partner extends People {
    private Boolean adherentPartner;

    private Boolean activePartner;


    private User user;



    public Partner(String firstName, String lastName, int age, Boolean adherentPartner, Boolean activePartner,User user) {
        super(firstName, lastName, age);
        this.adherentPartner = adherentPartner;
        this.activePartner = activePartner;
        this.user = user;
    }
    public Partner (){}

    public Boolean getAdherentPartner() {
        return adherentPartner;
    }

    public void setAdherentPartner(Boolean adherentPartner) {
        this.adherentPartner = adherentPartner;
    }

    public Boolean getActivePartner() {
        return activePartner;
    }

    public void setActivePartner(Boolean activePartner) {
        this.activePartner = activePartner;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + user
                + (adherentPartner?" ::Adherent Partner:: ":" ::Active Partner:: ") ;
    }
    public void bet(int amount){
        System.out.println(" user " + user.getEmail() + " Bet for " + amount);
    }

    public void saveToDataBase(){
        try {
            conexion con = new conexion();
            PreparedStatement statement = con.connection.prepareStatement(
                    "INSERT INTO partner (firstName, lastName, age, adherentPartner, activePartner, email, address, creditCardNumber, idCard) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );
            statement.setString(1, this.getFirstName());
            statement.setString(2, this.getLastName());
            statement.setInt(3, this.getAge());
            statement.setBoolean(4, this.adherentPartner);
            statement.setBoolean(5, this.activePartner);
            statement.setString(6, this.user.getEmail());
            statement.setString(7, this.user.getAddress());
            statement.setInt(8, this.user.getCreditCardNumber());
            statement.setInt(9, this.user.getIdCard());

            statement.executeUpdate();
            con.connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

