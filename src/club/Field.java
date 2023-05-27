package club;

public  class Field  {
    private int lennght;
    private int width;
    private double levelOfDrampness;
    private double minimumThreshold = 40.0;
    private double maximumThreshold = 80.0;
    private boolean openValve = false;

    public  Field(int lennght, int width, double levelOfDrampness) {
        this.lennght = lennght;
        this.width = width;
        this.levelOfDrampness = levelOfDrampness;
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
if (levelOfDrampness >= maximumThreshold){
    System.out.println("Irrigate Stop");
}else {
    System.out.println("Irrigate Activate");
    openValve = true;
    double waterQuantity = calculateWaterQuantity();
    applyWater(waterQuantity);
    levelOfDrampness += calculateIncrementOfDrampness(waterQuantity);
    openValve = false;
}
}
private double calculateWaterQuantity(){
        double waterQuantity = 4;
    double fieldArea = lennght * width;
    double quantityOfWaterForMeterSquare = waterQuantity * fieldArea;
    return quantityOfWaterForMeterSquare;

}
private void applyWater(double waterQuantity){
        System.out.println("Applyly water of field ...");
    System.out.println("Water Aplicated : " + waterQuantity + " Lts " );

}
private double calculateIncrementOfDrampness(double waterQuantity){
        double increments = 0.1;
        //este metodo deveria incrementar la cantidad de humedad despues de regar
        return increments;
}




}

