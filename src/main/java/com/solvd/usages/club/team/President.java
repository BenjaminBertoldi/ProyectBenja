package com.solvd.usages.club.team;

import com.solvd.usages.people.People;

import java.sql.Statement;
import java.util.Scanner;

public class President extends People {
    private String takesResolutions;

    public President(String firstName, String lastName, int age, String takesResolutions) {
        super(firstName, lastName, age);
        this.takesResolutions = takesResolutions;
    }

    public President() {
    }


    public String getTakesResolutions() {
        return takesResolutions;
    }

    public void setTakesResolutions(String takesResolutions) {
        this.takesResolutions = takesResolutions;
    }

    @Override
    public String toString() {
        return "President" + super.toString() + "\n" +
                "Takes Resolutons: " + takesResolutions ;
    }
    public void politicsEntryOutlay(){
        Scanner scan = new Scanner(System.in);

        System.out.println(" Insert total of the Entrys ");
        double entrys = scan.nextInt();

        System.out.println(" Inser total of the Outlay ");
        double outlay = scan.nextInt();

        double utility = entrys - outlay;

        double marginOfUtility = (outlay / entrys) * 100;

        System.out.println("result");
        System.out.println("Entrys: $ " + entrys);
        System.out.println("Outlay: $ " + outlay);
        System.out.println("Utility: $ " + utility);
        System.out.println("Margin of Utility: " + marginOfUtility + "%");
    }

    
}
