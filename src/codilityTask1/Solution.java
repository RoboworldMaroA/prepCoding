package codilityTask1;

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

            int[] A = new int[]{1, 3, 6, 4, 1, 2};

//            for (int i = 0; i <= A.length-1; i++) {
//
//                System.out.print(A[i]+",");
//
//            }
             solution(A);

        }


        static int solution(int[] A) {
            // write your code in Java SE 11
            int answer = 1;
            //sort array
            Arrays.sort(A);

            for (int i = 0; i < A.length; i++) {
//                System.out.print(A[i]+",");
                if(A[i]==answer){
                    answer++;
                }

            }
            return  answer;
        }


    }


