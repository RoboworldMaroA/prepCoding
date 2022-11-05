package codilityTask1;
/*
Description of the task here
 */

public class StarterClass {

    public static void main(String[] args) {
        int X=10;
        int Y=85;
        int D=30;

    // object of the solution
    StarterClass answerSolution = new StarterClass();
        System.out.println("Answer : " + answerSolution.solution(X,Y,D));



    }

    public int solution(int X, int Y, int D){
        int answer = X+Y+D;
        return answer;
    }





}
