package codility.countingElements;

/*
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */


import java.util.HashSet;

public class MissingInteger {
    public static void main(String[] args) {
        //for this array answer should be 5
        int[] A = new int[]{1, 2,3,2};

        // object of the solution
        MissingInteger answerSolution = new MissingInteger();

        int result = answerSolution.solution(A);
        System.out.println(result);
     }

        public int solution ( int[] A){

            //create sorted set  with value from 1 to length of given array
            HashSet<Integer> hashA = new HashSet<Integer>();

            for (int i = 1; i <= A.length+1; i++) {
                hashA.add(i);
                System.out.println(hashA);

            }
            //test only
            System.out.println(hashA);

            //remove elements from the hashset values from the array A
            //and then iterate in the set after removing and return the value next after the value left
            for(int a:A){
                hashA.remove(a);
                System.out.println(hashA);
            }

            return hashA.iterator().next();
        }
    }

