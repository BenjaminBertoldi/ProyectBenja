package com.solvd.usages.club.team;

import java.util.Random;

public  class Field implements Weather {

    private double lennght = 105;
    private double width = 70;
    private Random random;

    double fieldArea = lennght * width;
    private double levelOfDrampness;
    double soilMoistureCapacity = 0.2;
    double waterQuantity = 3.0;
    private boolean irrigated = false;
    private double minimumThreshold = 40.0;
    private double maximumThreshold = 80.0;
    private boolean openValve = false;

    public  Field(int lennght, int width, double levelOfDrampness) {
        this.lennght = lennght;
        this.width = width;
        this.levelOfDrampness = levelOfDrampness;
        this.random = new Random();
    }

    public double getLennght() {
        return lennght;
    }

    public void setLennght(int lennght) {
        this.lennght = lennght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getLevelOfDrampness() {
        return levelOfDrampness;
    }

    public void setLevelOfDrampness(double levelOfDrampness) {
        this.levelOfDrampness = levelOfDrampness;
    }

    public boolean isOpenValve() {
        return openValve;
    }

    public void setOpenValve(boolean openValve) {
        this.openValve = openValve;
    }

    @Override
    public String toString() {
        return "Field Dimension:\n" +
                "Lenght: " + lennght + " Meters\n" +
                "Width: " + width + " Meters"
                ;
    }



public void irrigate(){
    if (irrigated) {
        System.out.println("Field already irrigated");
        return;
    }
if (levelOfDrampness >= maximumThreshold){
    System.out.println("Irrigate Stop");
} else if (getWeather().equals("Rainy")) {
    System.out.println("Don´t Irrigate");
} else {
    System.out.println("Irrigate Activate");
    openValve = true;
    applyWater(waterQuantity);
    levelOfDrampness += calculateIncrementOfDrampness(waterQuantity);
    openValve = false;
    irrigated = true;
}
    }
    private void applyWater(double waterQuantity){
        double currentSoilMoisture = 0.1;
        double waterToIncorporate = (soilMoistureCapacity - currentSoilMoisture) * fieldArea;

        System.out.println("Applyly water of field ...");
        System.out.println("Water Aplicated : " + waterToIncorporate + " Lts " );

    }


    private double calculateIncrementOfDrampness(double waterQuantity){

        double totalWater = waterQuantity * fieldArea;
        double soilCapacity = fieldArea * soilMoistureCapacity;
        double increments = totalWater / soilCapacity;
        return increments;
    }
    public String getWeather(){
        String[] weathers = {"Cloudy","Sunny","Rainy"};
        int index = random.nextInt(weathers.length);
        return weathers[index];
    }


}

