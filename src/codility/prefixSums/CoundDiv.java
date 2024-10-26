package codility.prefixSums;

import java.util.ArrayList;
import java.util.List;

/*
Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3,
 because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.
 */
public class CoundDiv {
    public static void main(String[] args) {
        int A=6;
        int B=11;
        int K=2;

        // object of the solution
        CoundDiv answerSolution = new CoundDiv();
        System.out.println("Answer Test 1 : " + answerSolution.solution3(A,B,K));


//        Test 2
        int A2=100;
        int B2=123000000;
        int K2=10000;

        // object of the solution
        System.out.println("Answer test 2 : " + answerSolution.solution(A2,B2,K2));


        //        Test 3 max values
        int A3=11;
        int B3=345;
        int K3=17;

        // object of the solution
        System.out.println("Answer test 3 : " + answerSolution.solution(A3,B3,K3));





        //        Test 5 max values
        int A5=100;
        int B5=123000000;
        int K5=10000;

        // object of the solution
        System.out.println("Answer test 5 sol 2 : " + answerSolution.solution2(A5,B5,K5));



        //        Test 4 max values
        int A4=11;
        int B4=345;
        int K4=17;

        // object of the solution
        System.out.println("Answer test 4 sol 2 : " + answerSolution.solution2(A4,B4,K4));




        //      Solution 3
        int A6=100;
        int B6=123000000;
        int K6=10000;

        // object of the solution
        System.out.println("Answer test 6 sol 3 : " + answerSolution.solution3(A6,B6,K6));

    }


    //this version give you only 50% ;-(
    public int solution(int A, int B, int K){
        int answer = 0;


        List<Integer> allElements = new ArrayList<>();

        for(int i = A; i <= B; i++){
            allElements.add(i);
//            System.out.println("Value of i: " + i);
        }



//        System.out.println("element in array: "+allElements.toString());

        for(int j=0; j< allElements.size();j++){


            if(allElements.get(j)%K!=0){
//                System.out.println(j);
            }
            else {
                answer++;
            }
        }

        return answer;
    }

    //version 2

    public int solution2(int A, int B, int K) {
        int divisors = 0;

        //nothing to do when K > B
        if(K > B) {
            if(A == 0 || B == 0) {
                return 1; //K mod 0 == 0 so count a single divisor
            }
            return 0; //no divisors when A, B both != 0
        }

        if(A == 0) {
            divisors++;  //K mod 0 == 0
        }

        int updatedA = A;
        if(K > A) {
            updatedA = K; //skip checking all values < K
        }

        int firstNonZeroDivisor = 0;
        int lastNonZeroDivisor = 0;

        for(int i=updatedA; i<=B; i++) {
            if(i % K == 0) {
                firstNonZeroDivisor = i;
                break;
            }
        } for(int i=B; i>=updatedA; i--) {
            if(i % K == 0) {
                lastNonZeroDivisor = i;
                break;
            }
        }
        if(firstNonZeroDivisor == 0 && lastNonZeroDivisor == 0) {
            divisors = 0;
        }
        else {
            divisors += ((lastNonZeroDivisor - firstNonZeroDivisor) / K) + 1;
        }

        return divisors;
    }



    //version 3

    public int solution3(int A, int B,int K){

        //ceil round the number up if your value is 2.6 it will give you 3 so 100/10000 give you 1
        //then update base that is 1*1000 so is 10000

        //later new B is 10000-123000000 = 122990000
        // later find the count value (    //floor give you smaller number)
        //so 122990000/10000 = 12299 + 1 so this is why is 12300
       // why he added 1 ???



        int base = (int)Math.ceil((double) A/K);
        base *= K;
        B-=base;
        int count = (int)Math.floor((double) B/K);
        count++;
        return count;

    }




}
