package InterfaceSamochod;
//Add class Bike
public class Bike extends Vehicle {
    Bike(String name, int amountOfWheels){
        super(
                name
        );

        this.amountOfWheels = amountOfWheels;
    }
    int amountOfWheels;

}
