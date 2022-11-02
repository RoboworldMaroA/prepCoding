/*
Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”.
 */



public class FizzBuzzNumbers {
    public static void main(String args[]){
        //System.out.println("Hello Maro A");

        for(int i=0;i<=100;i++){
            String word = "";

            //if rest od division is 0 then
            if(((i%3)==0)&&((i%5)==0)){
                    word="FizzBuzz";
                  //  System.out.println(word);
                }

            //if rest of division by 3 is 0 then

           else if(i%3==0) {
                word="Fizz";
                //System.out.println(word);

            }



            else if(i%5==0) {
                word="Buzz";
                //System.out.println(word);

            }
            else {

                word= String.valueOf(i);
                //System.out.println(i);
            }

            System.out.println(word);

        }

       // System.out.println(i);

    }
}
