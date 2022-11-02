package ReverseWord;

/*
6. Write a Java program to reverse a string without using string inbuilt function.
This is another specific Java coding exercise the interviewer could use to test your Java knowledge and experience.

 */



public class reverseStringUsingReverse {

    //this function allows us to use in if statement so additional statement is easier to do
    public static String reverseWord(String word){
        if(word== ""){
            throw new IllegalArgumentException("Can not be empty string");
        }

        //create sting builder
        StringBuilder newString = new StringBuilder();

       //copy  String to the newString

        newString.append(word);


        //use method reverse
        newString=newString.reverse();

        //remove character in the middle
        newString=newString.deleteCharAt(1);

        //at the end return new reversed string
        return newString.toString();

    }



    //main method

    public static void main(String args[]){
        String word="abc";

        //print a reversed word in the function reverseWord
        System.out.println("This is word: " + reverseWord(word));



        }

}
