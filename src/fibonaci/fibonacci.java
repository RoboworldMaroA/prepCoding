package fibonaci;

/*
This question is another specific exercise that can show your knowledge of using Java code to complete a task.
The interviewer probably wants to see that you can arrive at the correct solution in an acceptable amount of time. This is an ideal time
 to explain your process aloud as you write your code to show the interviewer your thought process.
 */
/*
Fibonacci sequence : in which each number is the sum of the two preceding ones
01234567890

0
0+1=1
1+1=2
2+1=3
3+2(previous)=5
5+3(prev)=8
8+5(previous)=13
13+8=21
21+13=34
34+21=51

 */


public class fibonacci {

    //this function allows us to use in if statement so additional statement is easier to do
    public static Integer fib(Integer fibNumber){

        int n1=0;
        int n2=1;
        int n3=0;
        System.out.print(n1+","+n2+",");

        for(int i=2; i<fibNumber;i++){
          //third number is sum of the previous numbers
            n3=n1+n2;


          System.out.print(n3+",");
          //now we tell that number one is number 2 and number 2 is number 3
          n1=n2;
          n2=n3;

        }
        //last number
        return n3;
    }



    //main method

    public static void main(String args[]){
       int fibNumber = 10;

        //print a reversed word in the function reverseWord
        System.out.print("For number: "+fibNumber+ "  Fibonacci value is: " + fib(fibNumber));


        }

}
