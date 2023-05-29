package club;

import team.Medical;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sponsor {
    private String hallmarkAgherent;
    private String slogan;





    public Sponsor(String hallmarkAgherent,String slogan) {
        this.slogan = slogan;
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

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
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
                return sp1;
            case 1:
                return sp2;
            case 2:
                return sp3;
            default:
                return null;
        }

        }

    }



