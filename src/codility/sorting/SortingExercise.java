package codility.sorting;

/*
Problem: You are given a zero-indexed array A consisting of n > 0 integers;
 you must return the number of unique values in array A. Solution O(nlogn):
  First, sort array A; similar values will then be next to each other.
  Finally, just count the number of distinct pairs in adjacent cells. 6.4:
  The number of distinct values — O(nlogn).

  //python solution

  def distinct(A):
   n = len(A)
    A.sort()
     result = 1
      for k in xrange(1, n):
      if A[k] != A[k- 1]:
       result += 1
        return

         result The time complexity is O(nlogn), in view of the sorting time.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingExercise {


    public static void main(String[] args) {
        int[] A=  new int[]{4,3,5,4,7,11,6,8,9,9,11};


        SortingExercise answerSolution = new SortingExercise();
        System.out.println("Answer : " + answerSolution.solution2(A));





    }

    public int solution(int[] A){
        int result = 1;

        List<Integer> newList = new ArrayList();

        //add element from array to the list
        for(int i=0;i<A.length;i++){

            newList.add(A[i]);
        }

        //sort array
        Collections.sort(newList);


        System.out.println("Elements in list: " + newList);

        return result;
    }


    public int solution2(int[] A){
        int result = 1;
        //sort array
        Arrays.sort(A);
        //print sorted elements in the array
        System.out.println("Elements in list: " + Arrays.toString(A));
        for(int i=0;i<A.length-1;i++){
            if(A[i]!=A[i+1]){
                result+=1;

            }
        }


        return result;
    }




}
