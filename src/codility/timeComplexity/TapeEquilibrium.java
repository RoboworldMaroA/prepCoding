package codility.timeComplexity;

/*
A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:

P = 1, difference = |3 − 10| = 7
P = 2, difference = |4 − 9| = 5
P = 3, difference = |6 − 7| = 1
P = 4, difference = |10 − 3| = 7
Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.

For example, given:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
the function should return 1, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−1,000..1,000].
 */

public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] A = new int[]{-3000,3000};

        // object of the solution
        TapeEquilibrium answerSolution = new TapeEquilibrium();
        System.out.println("Answer : " + answerSolution.solution(A));



    }

    /*
    The main strategy is to first calculate the sum of the entire array and then use a running sum for each array index to calculate the sum of both sub-arrays at each index.

     */

    public int solution(int[] A ){


        int sumAllValuesInArray =0;
        //find a=sum all elements in the array
        for(int i=0; i<A.length;i++){
            sumAllValuesInArray = sumAllValuesInArray + A[i];
        }

        double sumLeftSide =0;
        double sumRightSide=0;

        double minDiff = Integer.MAX_VALUE;
        //find what is a sum elements on the left and the right of the array
        for(int j=0; j<A.length-1;j++){
            sumLeftSide = sumLeftSide+A[j];
            sumRightSide=sumAllValuesInArray-sumLeftSide;
//            System.out.println("sum left:  " + sumLeftSide);
//            System.out.println("sum right: "+ sumRightSide);
            if(Math.abs(sumLeftSide-sumRightSide)<minDiff){
                minDiff=Math.abs(sumLeftSide-sumRightSide);
            }

        }
        return (int) minDiff;
    }


}
