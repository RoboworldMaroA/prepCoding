package ReverseWord;

/*
How do you reverse a string in Java?
There is no reverse utility provided in Java.
Hiring managers might ask this question to determine your knowledge of Java and your problem-solving skills.
 You can create a character array from the string and iterate it from the end to the beginning.
You can append the characters to a string builder and finally return the reversed string.
 */



public class reverseWord {

    //this function allows us to use in if statement so additional statement is easier to do
    public static String reverseWord(String word){
        if(word== ""){
            throw new IllegalArgumentException("Can not be empty string");
        }

        //create sting builder
        StringBuilder newString = new StringBuilder();

        //get a characters to the new array
        char[] characters = word.toCharArray();


        //loop all characters from the end to the beginning and append have founded elements to the newString
        for(int i=characters.length-1;i>=0;i--){
            newString.append(characters[i]);
        }

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
