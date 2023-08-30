package de.Vererbung;

public class Fahrzeug {
    protected String Hersteller;
    protected String Modell;
    protected int Baujahr;

    public Fahrzeug(){
    }

    public Fahrzeug(String Hersteller, String Modell,int baujahr){
        this.Hersteller = Hersteller;
        this.Modell = Modell;
        this.baujahr = baujahr;
    }
        public void startEngine(){
        System.out.println();
}

}
