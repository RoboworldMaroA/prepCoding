package InterfaceSamochod;

//this class extends (czyli zawiera w sobie wszystko co jest w klasie SportCar ale i takze wszystko co jest w klasie Car)
//Jakbysmy wywlaili ten konstruktor name i amountOfWheels to nie musielibysmy wpisywac tych danych podczas wprowadzania danych w Main class

public class SportCar extends Car{

    SportCar(String name, int amountOfWheels) {
        super(name, amountOfWheels);
    }
}
