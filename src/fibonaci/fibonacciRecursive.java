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


public class fibonacciRecursive {
    static int n1=0;
    static int n2=1;
    static int n3=0;
    //this function allows us to use in if statement so additional statement is easier to do
    public static void fib(int fibNumber){

        //for(int i=2; i<fibNumber;i++){
          //third number is sum of the previous numbers

      if(fibNumber>0) {
          n3 = n1 + n2;
          n1 = n2;
          n2 = n3;
          System.out.print(n3 + ",");
          //call back function
          fib(fibNumber - 1);
      }

    }



    //main method

    public static void main(String args[]){
       int fibNumber = 10;
        System.out.print(n1+","+n2+",");

        //print a reversed word in the function reverseWord
//        System.out.print("For number: "+fibNumber+);
        fib(fibNumber-2);

        }

}
