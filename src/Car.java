/**
 * Organisation: Hochschule Muenchen, Fakultaet 07
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, bauman21@hm.edu
 * Study group: IF3A
 * Date: 19. November 2016
 * Purpose: Loesung Praktikumseinheit 04: Car, Main-Test-Methode von Frau Prof. Dr. Hammerschall
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM
 */

public class Car {

    // Konstanten -----------------------------------------------------
    // Konstante fuer 100 km
    private static final double A_HUNDRET_KILOMETERS = 100.0;

    // Objektvariablen ------------------------------------------------
    private final String type;          // final, da sich der Autotyp nicht mehr veraendern wird
    private final double capacity;      // final, da sich das Tankvolumen nicht mehr aendern wird
    private final double consumption;   // final, da sich der Verbrauch in unserem Beispiel nicht mehr aendern wird
    private double fuel = 0;            // nicht final, da sich der Fuellstand aendern wird
    private int kilometers = 0;         // nicht final, da sich der Kilometerstand aendern wird

    // Konstruktor ----------------------------------------------------
    /**
     * Hier wird davon ausgegangen, dass der Benutzer die Car-Klasse immer
     * mit drei Parametern erzeugt, also kein Konstruktor mit zwei oder weniger
     * uebergebenen Parametern programmiert werden muss.
     */
    Car(String carType, double tankCapacity, double carConsumption) {

        this.type = carType;
        this.capacity = tankCapacity;
        this.consumption = carConsumption;

    }


    // Methoden -------------------------------------------------------
    void fill(int amount) {

        this.fuel += amount;

        /**
         * Falls der Tankfuellstand groesser oder gleich dem Tankvolumen ist,
         * soll der Tankfuellstand genau dem Tankvolumen entsprechen. Der
         * ueberschuessige Rest wird "weggeschuettet".
         */
        if (this.fuel >= this.capacity) {

            this.fuel = this.capacity;

        }
    }

    void drive(int km) {

        /**
         * Zuerst stelle ich fest, wie viel Treibstoff beim fahren der
         * geforderten Kilometer "km" verbraucht werden wuerde. Das wird in
         * fuelUsed gespeichert.
         */
        double fuelUsed = (this.consumption / A_HUNDRET_KILOMETERS) * km;

        /**
         * Sollte die Menge an Benzin, die ich braeuchte, um die geforderten
         * Kilometer "km" zu fahren, nicht in meinem Tank sein, so kann ich nur so
         * viele Kilometer fahren, wie ich mit meinem Tankinhalt eben schaffe. Diese
         * Strecke wird im if-Teil der if-else-Verzweigung berechnet und dem Kilometer-
         * Stand "kilometers" hinzugerechnet. Dabei wird ja der Tank leer gefahren. Deshalb
         * wird der Tankfuellstand "fuel" auf 0 gesetzt.
         */
        if (fuelUsed >= this.fuel) {

            this.kilometers += (A_HUNDRET_KILOMETERS / this.consumption) * this.fuel;
            this.fuel = 0;

        }
        /**
         * Im else-Teil der if-else-Verzweigung bin ich jetzt sicher, dass ich noch genug
         * Benzin im Tank habe, um die geforderte Strecke "km" zu fahren. Also rechne ich
         * zu meinem Kilometerstand "kilometers" die geforderte Strecke "km" hinzu und
         * ziehe von meinem Tankfuellstand "fuel" die verbrauchte Menge Treibstoff ab.
         * Der Tankinhalt kann dabei nicht negativ werden, da "fuelUsed" nicht groesser als
         * mein Tankinhalt "fuel" sein kann. Das wird im if-Teil abgefangen..
         */
        else {

            this.kilometers += km;
            this.fuel -= (this.consumption / A_HUNDRET_KILOMETERS) * km;

        }
    }

    // Mit String.format formatierte Ausgabe.
    public String toString() {

        return String.format("%s(%.0f,%d)", type, fuel, kilometers);

    }

}
