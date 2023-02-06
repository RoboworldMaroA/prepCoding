package InterfaceTest;

//this main class has an object myOperationsOnNumbers that is using methods implemented in the class calculations
//In Calculation class are implemented method that do the additions and subtractions
public class MainClass{
    public static void main(String[] args) {
        //do the calculation here and use an interface
        OperationsOnNumbers myOperationsOnNumbers = new OperationsOnNumbers();
        System.out.println("This is a sum of two values: "+myOperationsOnNumbers.sum(2,2));

        System.out.println("This is subtraction of two values: "+ myOperationsOnNumbers.subtraction(2,3));

        System.out.println("print hello : ");
        myOperationsOnNumbers.printHello();

        System.out.println("This is calculation Sum from interface: "+ Calculation.aaa);

        //short version for if statement
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int num1=2;
        String result2 = (num1%2!=0) ? "Odd" : "Even";

        System.out.println(result2);


        //********************************
       //checking array for string
        String[] database = {"john","frank","Maro"};
        String password = "Maro";

        boolean foundPassword = false;
        for (int i=0;i<database.length;i++){
            if(password.equals(database[i])){
                System.out.println("Password: \""+ password+"\" is good. Thank you.");
                foundPassword=!foundPassword;
            }
        }

        String result3 = (foundPassword) ? "Password exist" : "Password not exist";
        System.out.println(result3);
        //***************



    }
}
