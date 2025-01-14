package codility;

/*

An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given

    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]

Given

    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
 */

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {

        int K = 3;
        int[] array =new int[]{3, 8, 9, 7, 6};

        System.out.println("Array before rotation: " + Arrays.toString(array) );

        CyclicRotation solutionAnswer = new CyclicRotation();


        System.out.println("Array after "+K+" rotations."+ Arrays.toString(solutionAnswer.solution(array, K)));
    }



    public int[] solution(int[] A, int K){
        int[] answer =new int[A.length];

        //Loob thrue all elements and find the final index that it should be rotated\
        //for example if k=3 so each index is calculated :
        // 0+3 % 5 index is
        for(int i =0; i<A.length;i++){
//            System.out.println(A[i]);
//            answer[i]=A[i];

            int indexThatWillBeRotated = (i + K) % A.length;
            System.out.println("It is value of the index: "+i+"  "+indexThatWillBeRotated);
            answer[indexThatWillBeRotated] = A[i];

        }


       return answer;

    }






}
