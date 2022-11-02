/*
Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”.
 */

//switch can not be boolean so we shoiuld use if else statement

public class FizzBuzzNumbersFunctionSwitch {

    //this function allows us to use in if statement so additional statement is easier to do
    public static boolean FizzBuzzModulus(int number, int mod){
        return number%mod==0;


    }




    public static void main(String args[]){
        ////System.out.println("Hello Maro A");
        String word = "";
        for(int i=0;i<=100;i++){


            //if rest od division is 0 then
            if (true == FizzBuzzModulus(i, 15)) {
                word = "FizzBuzzz";


                //if rest of division by 3 is 0 then
            } else if (true == FizzBuzzModulus(i, 3)) {
                word = "Fizz";
            } else if (true == FizzBuzzModulus(i, 5)) {
                word = "Buzz";
            } else {
                word = String.valueOf(i);
                System.out.println(word);
            }
        }}
}
