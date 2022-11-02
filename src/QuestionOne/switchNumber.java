package QuestionOne;

/*
Write a Java program to swap two numbers using the third variable.
 */



public class switchNumber {

    //this function allows us to use in if statement so additional statement is easier to do
    public static boolean switchNumber(int number, int numberTwo){
        return number==numberTwo;


    }




    public static void main(String args[]){
        int numberOne = 1;
        int numberTwo = 2;
        int thirdVariable =0;



        System.out.println("Number one is: " +numberOne);
        System.out.println("Number Two is: " +numberTwo);

        thirdVariable=numberOne;
        numberTwo=thirdVariable;

        System.out.println("Number one is: " +numberOne);
        System.out.println("Number Two is: " +numberTwo);



        }

}
