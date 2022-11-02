/*
Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”.
 */



public class FizzBuzzAlphabetFunction {

    //this function allows us to use in if statement so additional statement is easier to do
    public static boolean FizzBuzzModulus(int number, int mod){
        return number%mod==0;


    }




    public static void main(String args[]){
        //System.out.println("Hello Maro A");

        String[] alphabet = new String[]{"A","B","C","D","E","F","G","H","I","I","J","K","L","M","N","O","P","R","S","T","U","V","W","X","Y","Z"};

        for(int i=0;i<alphabet.length;i++){
            String word = "";

            //if rest od division is 0 then
            if(FizzBuzzModulus(i,15)){
                    word="FizzBuzzz";
                }

            //if rest of division by 3 is 0 then

           else if(FizzBuzzModulus(i,3)) {
                word="Fizz";


            }



            else if(FizzBuzzModulus(i,5)) {
                word="Buzz";


            }
            else {

                word= String.valueOf(alphabet[i]);
            }

            System.out.println(word);

        }


    }
}
