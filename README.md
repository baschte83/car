# Car

### Assignment, class and language
This is my solution to the assignment **Car** of class **software developement 1,** written in Java.

### Requirements
This assignment consists of two classes: class **Car** and class **CarMain.** CarMain was given by the professor and consists of several tests for class **Car**. I had to write the class **Car.** This class represents different kind of cars. A car consists of:
1. **type:** the type of this car object
2. **capacity:** the amount of gasoline this car object can fuel
3. **consumption:** the amount of gasoline this car object consumes to drive 100 km
4. **fuel:** the current amount of gasoline this car object has left its tank
5. **kilometers:** the mileage of this car object

And a car has the following methods:
1. **void fill(int amount):** fills up the tank until it is full. If **amount** is greater than the empty space in the tank, the spare gasoline is lost.
2. **void drive(int km):** this car tries to drive the distance **km**. If the car drives, it consumes **consumption** amount of gasoline. If there is no gasoline left in its tank, but there are still **km** to go, the car stops. If the car moves, the values of **fuel** and **kilometers** change.
3. **public string toString():** generates a String representation of this car object according to this scheme: type (fuel, kilometers)

If you initiate a new car, you can determine its **type,** its **capacity** and its **consuption**. **Fuel** and **kilometers** are set to 0 automatically. 
