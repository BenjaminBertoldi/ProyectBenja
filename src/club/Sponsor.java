package club;

import team.Medical;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sponsor {

    private String hallmarkAgherent;





    public Sponsor(String hallmarkAgherent) {
        this.hallmarkAgherent = hallmarkAgherent;
    }

    public Sponsor() {
    }

    public String getHallmarkAgherent() {
        return hallmarkAgherent;
    }

    public void setHallmarkAgherent(String hallmarkAgherent) {
        this.hallmarkAgherent = hallmarkAgherent;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "hallmarkAgherent='" + hallmarkAgherent + '\'' +
                '}';
    }
    public static Sponsor getAdBreack(Sponsor sp1,Sponsor sp2,Sponsor sp3){
        Random random = new Random();
        int randomNumbers = random.nextInt(3);

        switch (randomNumbers) {
            case 0:
                System.out.println("Unique, as First Love \n ");
                System.out.println(" 100 years of the Unique Bottle ");
                return sp1;
            case 1:
                System.out.println("The Super Discounts arrived \n ");
                System.out.println("¡¡70% off!!");
                return sp2;
            case 2:
                System.out.println("New Galaxi Z Flip \n");
                System.out.println("keep all your memories and files with more than 2 TB of memory");
                return sp3;
            default:
                return null;
        }

        }

    }



