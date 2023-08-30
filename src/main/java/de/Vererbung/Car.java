package de.Vererbung;

public class Car extends Vehicle {
    protected int doorCount;
    public Car(){
        super(brand,model);
    }
    public Car(int doorCount) {
        super(brand, model);
        super.toString();
        this.doorCount = doorCount;
    }

    public Car(String brand, String model, int doorCount){
        super(brand,model);
        this.doorCount= doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }
    public void setDoorCount(int doorCount){
        doorCount = 4;
    }
    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                '}';
    }
}
