/**
 * Organisation: Hochschule Muenchen, Fakultaet 07
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, bauman21@hm.edu
 * Study group: IF3A
 * Date: 19. November 2016
 * Purpose: Loesung Praktikumseinheit 04: CarMain, Main-Test-Methode von Frau Prof. Dr. Hammerschall
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM
 */

/**
 * Testklasse Auto
 * @author Ulrike Hammerschall
 */
public class CarMain {

    /**
     * main-Methode mit Testprozedur. Erwartet keine Eingabewerte.
     * @param args
     */
    public static void main(String[] args) {

        // Initialisierung der Testautos
        Car fox = new Car("Fox", 35, 4);
        Car hummer = new Car("Hummer", 100, 25);

        // Tanken 30 Liter
        fox.fill(30);
        hummer.fill(30);
        System.out.println(fox.toString());    // Fox(30,0)
        System.out.println(hummer.toString()); // Hummer(30,0)

        // 100 km weit fahren
        fox.drive(100);
        System.out.println(fox.toString());    // Fox(26,100)
        hummer.drive(100);
        System.out.println(hummer.toString()); // Hummer(5,100)

        // 100 km weit fahren
        fox.drive(100);
        hummer.drive(100);
        System.out.println(fox.toString());    // Fox(22,200)
        System.out.println(hummer.toString()); // Hummer(0,120)

        // Tanken 30 Liter
        fox.fill(30);
        hummer.fill(30);
        System.out.println(fox.toString());    // Fox(35,200)
        System.out.println(hummer.toString()); // Hummer(30,120)

        // 200 km weit fahren
        fox.drive(200);
        hummer.drive(200);
        System.out.println(fox.toString());    // Fox(27,400)
        System.out.println(hummer.toString()); // Hummer(0,240)
    }

}