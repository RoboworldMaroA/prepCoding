package codilityTask1;
/* Result 100% */
/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermMissingElem {


    public static void main(String[] args) {
       int[] A = new int[]{2,3,1,4,5,6,7,8,9,10,11,13};

        // object of the solution
        PermMissingElem answerSolution = new PermMissingElem();
        System.out.println("Answer : " + answerSolution.solution(A));



    }

    public int solution(int[] A) {

        int answer = 1;
        Arrays.sort(A);
//        System.out.println(Arrays.toString(A));

        for (int i = 0; i < A.length; i++) {
//            System.out.println(A[i]);
            if (answer == A[i]) {
                answer++;
            }
        }
        return answer;
    }





}
