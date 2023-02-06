package codility;

//This is a demo task.
//
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [−1,000,000..1,000,000].
//


import java.util.Arrays;

class Solution {


        public static void main(String args[]) {

            int[] A1 = new int[]{1, 3, 6, 4, 1, 2};//test 1
            int[] A2 = new int[]{1, 2, 3};//test 2
            int[] A3 = new int[]{-2,-1};//test 3

            //Create object to get a value from a solution
            Solution missingIntegerInSolution = new Solution();
            System.out.println("Test one : Missing value is: "+ missingIntegerInSolution.solution(A1));
            System.out.println("Test two : Missing value is: "+ missingIntegerInSolution.solution(A2));
            System.out.println("Test three : Missing value is: "+ missingIntegerInSolution.solution(A3));

//            solution(A1);

        }


        public int solution(int[] A) {
            // write your code in Java SE 11
            int answer = 1;
            //sort array from smallest to the biggest
            Arrays.sort(A);

            for (int i = 0; i < A.length; i++) {
//                System.out.print(A[i]+",");//test only
                //if element in the sorted array is equal the answer then increment the answer
                if(A[i]==answer){
                    answer++;
                }

            }
            //if the looped value is not equal the incremented value it means that this value is not in the array
            // and is the smallest value
            return  answer;
        }//end of the solution method


    }


