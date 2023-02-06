package InterfaceSamochod;

//there are a methods that they are abstract methods
//abstrakyjna metoda nie ma ciala, jest to pusta metoda bez zadnych danyc
// moga tez tam byc zmienne ktore beda Static Final, nie mozna ich zmieniac
public interface Moving {
    static final String interfaceName = "Moving";
    void goForward();
    void turnRight();
}
