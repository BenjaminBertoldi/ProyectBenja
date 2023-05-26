package club;

public  class Field  {
    private int lennght;
    private int width;
    private double levelOfDrampness;
    private double minimumThreshold = 40.0;
    private double maximumThreshold = 80.0;
    private boolean openValve;

    public  Field(int lennght, int width) {
        this.lennght = lennght;
        this.width = width;
        this.levelOfDrampness = 0.0;
        openValve = false;
    }

    public int getLennght() {
        return lennght;
    }

    public void setLennght(int lennght) {
        this.lennght = lennght;
    }

    public int getWidth() {
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

    @Override
    public String toString() {
        return "Field Dimension:\n" +
                "Lenght: " + lennght + " Meters\n" +
                "Width: " + width + " Meters"
                ;
    }
public void irrigate(){
if (levelOfDrampness < minimumThreshold){
    System.out.println("Irrigate Activate");
    openValve = true;
    double waterQuantity = calculateWaterQuantity();
    applyWater(waterQuantity);
    levelOfDrampness += calculateIncrementOfDrampness(waterQuantity);
}else if (levelOfDrampness == maximumThreshold){
    System.out.println("Irrigate Stop");
    openValve = false;
}else {
    System.out.println("Level of Drampness is optimal");
}
}
private double calculateWaterQuantity(){
        double waterQuantity = 100;
    return waterQuantity;

}
private void applyWater(double waterQuantity){
        double fieldArea = lennght * width;
        double cauntityOfWaterForMetrerSquare = waterQuantity / fieldArea;
    System.out.println("Applyly water of field ...");
    System.out.println("Water Aplicated : " + cauntityOfWaterForMetrerSquare + " Lts" );

}
private double calculateIncrementOfDrampness(double waterQuantity){
        double increments = 1.0;
        return increments;
}




}

