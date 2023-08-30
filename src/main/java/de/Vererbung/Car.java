package de.Vererbung;

public class Car extends Vehicle {
    protected int doorCount;

    public Car(String brand, String model, int year,int doorCount){
        super(brand,model,year);
        this.doorCount= doorCount;
    }
    public int getDoorCount() {
        return doorCount;
    }
    public void setDoorCount(int doorCount){
        this.doorCount = doorCount;
    }
    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                '}';
    }
}
