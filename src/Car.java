/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 19. November 2016
 * Purpose: solution to lab Car
 */
class Car {

    /**
     * Constant value for 100 km.
     */
    private static final double A_HUNDRET_KILOMETERS = 100.0;

    /**
     * Private final variable to store the type of this car object.
     */
    private final String type;

    /**
     * Private final variable to store the tank capacity of this car object.
     */
    private final double capacity;

    /**
     * Private final variable to store the gasoline consumption of this car object.
     */
    private final double consumption;

    /**
     * Private variable to store the actual amount of gasoline in the tank of this car object.
     */
    private double fuel = 0;

    /**
     * Private variable to store the actual driven distance of this car object.
     */
    private int kilometers = 0;

    /**
     * Constructor of an object of this class.
     * @param carType - type of this car object.
     * @param tankCapacity - capacity of the tank of this car object.
     * @param carConsumption - consumption of this car object.
     */
    Car(String carType, double tankCapacity, double carConsumption) {

        this.type = carType;
        this.capacity = tankCapacity;
        this.consumption = carConsumption;

    }


    /**
     * Method to fill a certain amount of gasoline into the tank of this car object.
     * @param amount - amount of gasoline to fill in the tank.
     */
    void fill(int amount) {

        this.fuel += amount;

        /*
         * If 'amount' is greater than the the amount of free space in the tank,
         * than the spare amount of gasoline is tipped away.
         */
        if (this.fuel >= this.capacity) {

            this.fuel = this.capacity;

        }
    }

    /**
     * Method to drive the car for a distance of 'km' kilometers.
     * @param km - the distance this car object has to drive.
     */
    void drive(int km) {

        /*
         * 'fuelUsed' stores the actual amount of gasoline this car object needs to
         * drive the demanded 'km' distance.
         */
        double fuelUsed = (this.consumption / A_HUNDRET_KILOMETERS) * km;

        /*
         * If 'fuelUsed' is greater than the amount of gasoline this car object has (this.fuel),
         * this car object only drives the distance it can go with the gasoline in 'this.fuel'.
         * The left over distance from 'km' is tipped away. After the car has driven its distance
         * the variable 'fuel' is updated.
         */
        if (fuelUsed >= this.fuel) {

            this.kilometers += (A_HUNDRET_KILOMETERS / this.consumption) * this.fuel;
            this.fuel = 0;

        }
        else {

            this.kilometers += km;
            this.fuel -= (this.consumption / A_HUNDRET_KILOMETERS) * km;

        }
    }

    /**
     * This mehtod generates a String representation of this car object.
     * @return - returns a string with all values stored in this car object.
     */
    public String toString() {

        return String.format("%s(%.0f,%d)", type, fuel, kilometers);

    }

}
