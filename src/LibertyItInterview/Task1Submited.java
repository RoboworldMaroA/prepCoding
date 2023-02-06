package LibertyItInterview;

import java.util.Arrays;
import java.util.Random;

public class Task1Submited {


    public static void main(String[] args) {
    int N = 4;
    int[] arr = new int[]{4,2,4,5};
    // object of the solution
    Task1Submited answerSolution = new Task1Submited();
        System.out.println("Answer : " + Arrays.toString(answerSolution.solution(N)));

//        System.out.println("Answer min from given code: " + answerSolution.find_min(arr));

}

    public int[] solution(int N) {


        //create empty array with 4 numbers
        int[] answer = new int[4];
        Random randomValue = new Random();

        //add randomly generated numbers to the array
        for (int i = 0; i < answer.length; i++) {
            answer[i] = randomValue.nextInt(1000);
        }

        //test only
        // System.out.println("Created array");
        //for(int i=0;i<answer.length;i++)
        //{
        // System.out.print(answer[i]+" ");
        //}

        //find the minimum value
        int minimumValue = answer[0];//initial value of the first element in the array
        for (int j = 0; j < answer.length; j++) {
            if (answer[j] < minimumValue) {
                minimumValue = answer[j];
            }

        }
        // System.out.println("Minimum value in array is: "+ minimumValue);

        //if the minimum value is same like in the find min then this array is incorect
//        if(find_min(answer)!=minimumValue){
//            // System.out.println("This counter array is correct");
//            // System.out.println("This is a value from find_min_form my array");
//        }
//        else{
//            // System.out.println("Not correct array");
//        }
//
        return answer;
//
//    }

        //this method is provided used for testing
//    int find_min(int[] A) {
//        int ans = 0;
//        for (int i = 1; i < A.length; i++) {
//            if (ans > A[i]) {
//                ans = A[i];
//            }
//        }
//        return ans;
    }



}
