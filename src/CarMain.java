/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 19. November 2016
 * Purpose: solution to lab Car
 */
public class CarMain {

    /**
     * Main method to test the functionality of class car.
     * @param args - variable number of arguments from the terminal.
     */
    public static void main(String[] args) {

        // Initializes two new cars.
        Car fox = new Car("Fox", 35, 4);
        Car hummer = new Car("Hummer", 100, 25);

        // Both cars gas up 30 liters of gasoline.
        fox.fill(30);
        hummer.fill(30);

        // Printing the states of both cars to the screen.
        System.out.println("Should be Fox(30,0). Is: " + fox.toString());
        System.out.println("Should be Hummer(30,0). Is: " + hummer.toString());

        // Both cars have to drive 100 kilometers.
        fox.drive(100);
        System.out.println("Should be Fox(26,100). Is: " + fox.toString());
        hummer.drive(100);
        System.out.println("Should be Hummer(5,100). Is: " + hummer.toString());

        // Both cars have to drive another 100 kilometers.
        fox.drive(100);
        hummer.drive(100);
        System.out.println("Should be Fox(22,200). Is: " + fox.toString());
        System.out.println("Should be Hummer(0,120). Is: " + hummer.toString());

        // Both cars gas up another 30 liters of gasoline.
        fox.fill(30);
        hummer.fill(30);
        System.out.println("Should be Fox(35,200). Is: " + fox.toString());
        System.out.println("Should be Hummer(30,120). Is: " + hummer.toString());

        // Both cars have to drive 200 kilometers.
        fox.drive(200);
        hummer.drive(200);
        System.out.println("Should be Fox(27,400). Is: " + fox.toString());
        System.out.println("Should be Hummer(0,240). Is: " + hummer.toString());
    }

}