package InterfaceSamochod;

//this class extend Vehicle class ,
//Java not allows us to extend from more then one class,
// so if we add another class for sample Moving then will be an error
// this is why we nee to use interface, which allows us to use more methods
//We can have Vehicle like Car, Truck, Bike, Motorbike
//We can implement more than one class
public class Car extends Vehicle implements Moving, Comparable<String>,Operations{

    //create constructor, we can keep some data with the details here
    //but we want to add aswel what vehicle can do so this vehicle can drive forward, turn left, turn right etc
   Car(String name, int amountOfWheels){
       super(
               name
       );

       this.amountOfWheels = amountOfWheels;
   }
    int amountOfWheels;


   boolean opened = false;

   void openCloseDoor(){
       opened =!opened;
       if(opened)
           System.out.println("Door opened");
       else
           System.out.println("Door closed");

   }

    @Override
    public void goForward() {
        System.out.println("Go Forward");

    }

    @Override
    public void turnRight() {
        System.out.println("Turn Right");

    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void openDoor() {
        System.out.println("Opening the door");

    }

    @Override
    public void closeDoor() {
        System.out.println("Close the door");

    }
}
