package InterfaceSamochod;

public class Main {
    public static void main(String[] args) {
        //Create object in the Car
        Car myCar = new Car("Honda",4);
        myCar.turnRight();
        myCar.goForward();

        //if we want to get the data from the interface operation


        myCar.openDoor();
        myCar.closeDoor();

        myCar.openCloseDoor();
        myCar.openCloseDoor();

        SportCar mySportCar = new SportCar("Subaru",4);
        mySportCar.openCloseDoor();

    }
}
