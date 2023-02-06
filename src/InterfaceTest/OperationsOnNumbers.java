package InterfaceTest;

public class OperationsOnNumbers implements Calculation{

    int A =0;
    int B =0;

    public int sum(int A, int B){
        return A+B;
    }

    public int subtraction(int A, int B){
        return A-B;
    }


    public void printHello() {
        System.out.println("Hello");
    }


}
