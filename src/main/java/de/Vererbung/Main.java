package de.Vererbung;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*Schritt 1: Erstellt eine Basisklasse "Fahrzeug" mit Eigenschaften wie "Hersteller", "Modell", und "Baujahr".
Schritt 2: Erstellt eine abgeleitete Klasse "Auto", die von "Fahrzeug" erbt und zusätzliche Eigenschaften wie "Anzahl der Türen" hat.
Schritt 3: Implementiert eine Methode in der "Fahrzeug"-Klasse, die Informationen über das Fahrzeug ausgibt.
Schritt 4: Überschreibt die Methode aus Schritt 3 in der "Auto"-Klasse, um auch die Anzahl der Türen auszugeben.
Schritt 5: Erstellt Instanzen der "Fahrzeug"- und "Auto"-Klassen und ruft die Methoden zur Ausgabe der Informationen auf.
*/
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("VW","Polo",1985);
        Car c1 = new Car("Volvo", "Klein", 2003,4);
        Car c2 = new Car("Käfer","Gross",1990,5);
        Motorcycle M1 = new Motorcycle("Harley","Chopper",1990,2);

        c2.setDoorCount(10);
        String brand = v1.getBrand();
        v1.setBrand("Mercedes");

        v1.startEngine();

        c1.setBrand("Käfer");
        c1.startEngine();

        System.out.println("Mein " + brand +" "+ c2.getBrand()+ " ist schneller als die " + M1.getBrand() + "und hat aber mehr als " + M1.wheels + " Räder !" );
    }
}