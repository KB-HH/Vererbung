package de.Vererbung;

public class Motorcycle extends Car {
    protected int wheels;

        public Motorcycle(String brand, String model,int year, int wheels){
        super(brand,model,year,wheels);
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
    }

    public String getModel() {
        return "Chopper";
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "wheels=" + wheels +
                '}';
    }
}
