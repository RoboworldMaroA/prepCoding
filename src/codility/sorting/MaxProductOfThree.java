package codility.sorting;


import java.util.Arrays;
import java.util.Random;

/*
A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

For example, array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
contains the following example triplets:

musisz prawdzic czy wartosc przy indeksie (0,1,2) ma wartosc wg wzoru (0 ≤ P < Q < R < N)
np:
0,1,2 = -3,1,2 ok
1,2,3 = 1,2,-2 -odpada poniewaz -2 jest mniejsze niz poprzednie
1,2,4= 1,2,5 - ok
1,2,5= 1,2,6 -ok
1,3,4= 1,-2,5 -odpada
1,3,5          -odpada
2,3,4= 2,-2,5 - odpada
2,3,5= 2,-2,6 - odpada
2,4,5 = 2,5,6 ok
3,4,5= -2,5,6 ok

Now multiply this values and the highest positive int is an answer.

(0, 1, 2), product is −3 * 1 * 2 = −6
(1, 2, 4), product is 1 * 2 * 5 = 10
(2, 4, 5), product is 2 * 5 * 6 = 60
Your goal is to find the maximal product of any triplet.

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A, returns the value of the maximal product of any triplet.

For example, given array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
the function should return 60, as the product of triplet (2, 4, 5) is maximal.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [3..100,000];
each element of array A is an integer within the range [−1,000..1,000].

import java.util.Arrays;
import java.util.Random;



 */
public class MaxProductOfThree {


        //This is 100% correct
        public static void main(String[] args) {

            int[] A=  new int[]{-3,1,2,-2,5,6};




            //this is for testing
            Random randomValue = new Random();
            int[] A2 = new int[0];
            for(int i=0;i<A2.length;i++){
                A2[i] = randomValue.nextInt(-1000000,1000000);

            }
            codility.sorting.Distinct answerSolution = new codility.sorting.Distinct();
            System.out.println("Answer : " + answerSolution.solution(A));



        }

        public int solution(int[] A){
            int result = 1;

            //check if array is empty
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
