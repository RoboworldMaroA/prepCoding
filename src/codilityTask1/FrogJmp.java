package codilityTask1;
/*
A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its target.

Write a function:

class Solution { public int solution(int X, int Y, int D); }

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:

  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100
Write an efficient algorithm for the following assumptions:

X, Y and D are integers within the range [1..1,000,000,000];
X ≤ Y.
 */


public class FrogJmp {
    public static void main(String[] args) {
        int X=10;
        int Y=85;
        int D=30;


//        Case 2
        int X2=10;
        int Y2=850;
        int D2=3000;




        FrogJmp answerSolution =new FrogJmp();

        System.out.println("Frog has to jump:" + answerSolution.solution(X,Y,D) +" times.");
        System.out.println("In Case 2 :Frog has to jump:" + answerSolution.solution(X2,Y2,D2) +" times.");



    }

    public int solution(int X, int Y, int D){
        int distanceToTravel = Y-X;
        int oneJump = D;
        int sumJumps =0;

//        System.out.println("distace to travel "+ distanceToTravel);
//        System.out.println("one Jump " + oneJump);
//        System.out.println(" Sum Jumps "+sumJumps);

        //check if the value after each jump is bigger than a distance that frog has to do
        while((oneJump*sumJumps)<distanceToTravel){
            oneJump++;
            sumJumps++;
        }
//        System.out.println("distace to travel after while loop "+ distanceToTravel);
//        System.out.println("one Jump after while loop " + oneJump);
//        System.out.println(" Sum Jumps after while loop "+sumJumps);

       return sumJumps;
    }




}
