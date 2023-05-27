package club;

import people.People;

import java.util.Scanner;

public class President extends People {
    private String takesResolutons;

    public President(String firstName, String lastName, int age, String takesResolutons) {
        super(firstName, lastName, age);
        this.takesResolutons = takesResolutons;
    }

    public President() {
    }


    public String getTakesResolutons() {
        return takesResolutons;
    }

    public void setTakesResolutons(String takesResolutons) {
        this.takesResolutons = takesResolutons;
    }

    @Override
    public String toString() {
        return "President" + super.toString() + "\n" +
                "Takes Resolutons: " + takesResolutons ;
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
