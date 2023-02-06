package LibertyItInterview;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task2Version3 {


    public static void main(String[] args) {
        int[] A=new int[]{5,19,8,1};
        int[] A1=new int[]{10,10};
        int[] A2=new int[]{3,0,5};

        // object of the solution
        Task2Version3 answerSolution = new Task2Version3();
        System.out.println("Answer : " + answerSolution.solution(A));



    }

    public int solution(int[] A) {

        int filters = 0; //Variable to hold the amount of the filters
        double sumPollution = 0;//sum of the pollution from all factories
        double desiredPollution = 0; //value reduced pollution

        //use Queue and reverse a values in the queue
        PriorityQueue<Double> queueFromFactories = new PriorityQueue<>(Collections.reverseOrder());

        //Fot=r testing only
        System.out.println(queueFromFactories);

        //add elements do the queue
        for (double i=0;i<A.length;i++) {
            queueFromFactories.add((double) A[(int) i]);
            desiredPollution += A[(int) i];
        }

        //print a values
        //System.out.println(queueFromFactories);

        //sum pollution should have a reduced by filters value
        sumPollution = desiredPollution;

        //pollution should be reduces minimum by half
        desiredPollution = desiredPollution / 2;

        double updatedPollution = 0;

        //if sum of pollution is bigger from desired pollution, then take a value from the head of the queue and
        //assign to variable updatedPollution, then calculate what is a sum pollution when taken elements is divided by 2
        //Then add do the queue value divided by 2.
        //SumPollution is checked again if is bigger then desiredPollution
        //Every while loop increase filters amount
        while (sumPollution > desiredPollution) {
            updatedPollution = queueFromFactories.poll();
            sumPollution = sumPollution- updatedPollution / 2;
            queueFromFactories.add(updatedPollution / 2);
            filters++;
        }

        return filters;


    }

}
