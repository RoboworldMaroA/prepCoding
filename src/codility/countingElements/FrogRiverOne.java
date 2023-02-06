package codility.countingElements;
/*
A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.

You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.

The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

For example, you are given integer X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.

Write a function:

class Solution { public int solution(int X, int[] A); }

that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.

If the frog is never able to jump to the other side of the river, the function should return −1.

For example, given X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
the function should return 6, as explained above.

Write an efficient algorithm for the following assumptions:

N and X are integers within the range [1..100,000];
each element of array A is an integer within the range [1..X].
 */


import java.util.HashSet;


public class FrogRiverOne {

    public static void main(String[] args) {
        int X=10;
        //given A array of the falling leaves in secon(K)
        //A[K]=[X]
        //K time in second  is an index of the array 0,1,2,3,4,5,6,7,
        //X Position
        //other word find the index of the array on the given number in the array
        int[] A = new int[]{1,3,1,4,2,3,5,4,3,2,6,8,9,10,7};
        int[] A1 = new int[]{2,2,2,2,2,2,2};

        // object of the solution
        FrogRiverOne answerSolution = new FrogRiverOne();
        System.out.println("Answer : " + answerSolution.solution(X,A));





    }

    public int solution(int X, int[] A){

        /*
        Java solution to Codility FrogRiverOne problem (Lesson 4 – Counting Elements) which scored 100%.
        The problem is to find the earliest time when a frog can jump to the other side of a river.
        The main strategy is to use java.util.Set to store all required integers for a full jump and a second java.util.
        Set to keep storing current leaves and to keep checking if the first set fully exists in the second set.
         */





        //create Hash set and Set make no different in output on codility
        //so create new Set or HashSet and this is a value of the x
        //this value we are goint to look at the array and if this value is there it means that this is a value that we are looking for
        HashSet requiredLeavesSet = new HashSet();
        for(int i=1; i<=X; i++) {
            requiredLeavesSet.add(i);
        }

        //It is correct because the numbers in the array have to be between 1 to X
        System.out.println("print looking a value (value x saved do the hash Set:  "+ requiredLeavesSet);

        HashSet currentLeavesSet = new HashSet();

        //version one
//        for(int p=0; p<A.length; p++) {
//            currentLeavesSet.add(A[p]);
//            //keep adding to current leaves set until it's at least the same size as required leaves set
//            if(currentLeavesSet.size() < requiredLeavesSet.size()) continue;
//
//            if(currentLeavesSet.containsAll(requiredLeavesSet)) {
//                return p;
//            }
//        }
//        return -1;



        //Version 2 from youtube
        for(int p=0; p<A.length; p++) {
            if(requiredLeavesSet.remove(A[p])){
                if(requiredLeavesSet.isEmpty()){
                    return  p;
                }
            }
        }
        return -1;


    }
    }



