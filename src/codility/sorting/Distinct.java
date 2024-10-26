package codility.sorting;

import codility.StarterClass;

import java.util.Arrays;
import java.util.Random;

public class Distinct {
    /*
    Write a function

    class Solution { public int solution(int[] A); }

    that, given an array A consisting of N integers, returns the number of distinct values in array A.

    For example, given array A consisting of six elements such that:

    A[0] = 2    A[1] = 1    A[2] = 1
    A[3] = 2    A[4] = 3    A[5] = 1
    the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [0..100,000];
    each element of array A is an integer within the range [−1,000,000..1,000,000].

     */


    //This is 100% correct
    public static void main(String[] args) {

        int[] A=  new int[]{2,1,1,2,3,1,5,5,2};
        Random randomValue = new Random();


        int[] A2 = new int[0];
        for(int i=0;i<A2.length;i++){
            A2[i] = randomValue.nextInt(-1000000,1000000);

        }
        Distinct answerSolution = new Distinct();
        System.out.println("Answer : " + answerSolution.solution(A));



    }

    public int solution(int[] A){
        int result = 1;

        //check if array is 0 only
        if(A.length==0){
            result = 0;
        }
        else{
            //sort array
            Arrays.sort(A);
            //print sorted elements in the array
            System.out.println("Elements in list: " + Arrays.toString(A));
            for(int i=0;i<A.length-1;i++){
                if(A[i]!=A[i+1]){
                    result+=1;
                }
            }
        }




        return result;
    }
    }



