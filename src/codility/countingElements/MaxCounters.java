package codility.countingElements;

/*
You are given N counters, initially set to 0, and you have two possible operations on them:

increase(X) − counter X is increased by 1,
max counter − all counters are set to the maximum value of any counter.
A non-empty array A of M integers is given. This array represents consecutive operations:

if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
if A[K] = N + 1 then operation K is max counter.
For example, given integer N = 5 and array A such that:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the values of the counters after each consecutive operation will be:

    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
The goal is to calculate the value of every counter after all operations.

Write a function:

class Solution { public int[] solution(int N, int[] A); }

that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.

Result array should be returned as an array of integers.

For example, given:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the function should return [3, 2, 2, 4, 2], as explained above.

Write an efficient algorithm for the following assumptions:

N and M are integers within the range [1..100,000];
each element of array A is an integer within the range [1..N + 1].
 */

//O(N) or O(N * log(N))
import java.util.HashSet;

public class MaxCounters {
    public static void main(String[] args) {
        int[] A = new int[]{3, 4, 4, 6, 1, 4, 4};
        int N = 5;

        // object of the solution
        MaxCounters answerSolution = new MaxCounters();

        int[] result = answerSolution.solution(5, A);
        for (int i : result) {
            System.out.println(i);

        }
     }

        public int[] solution ( int N, int[] A){

            int maxValue = 0;
            int minValue=0;
            //create array with the N numbers of counters
            int[] counters = new int[N];

            for (int i = 0; i < A.length; i++) {
                int operations = A[i];
                if (operations == N + 1) {
                    //max counter
                    for (int j = 0; j < counters.length; j++) {
                        minValue = maxValue;
                    }
                } else {
                    //increment
                    operations--;
                    counters[operations]=Math.max(counters[operations]+1,minValue+1);
                    maxValue = Math.max(maxValue, counters[operations]);
                }
            }

            for(int i=0;i<counters.length;i++){
                counters[i]=Math.max(counters[i],minValue);
            }
            return counters;
        }
    }

