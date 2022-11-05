package codilityTask1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/*
A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Write an efficient algorithm for the following assumptions:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
 */
public class OddOcurrenecesInArray {
    public static void main(String[] args) {

        int[] array =new int[]{9, 3, 9, 3, 9,7,9,5,7,9};
        OddOcurrenecesInArray solutionAnswer = new OddOcurrenecesInArray();
        System.out.println("Answer from solutions :"+ (solutionAnswer.solution(array)));

    }

    public int solution(int[] A){

        //create hash map allows me to use get and put
        HashMap<Integer, Integer> elementsAsAMap = new HashMap<Integer, Integer>();

        // find elements in the array that has same "value" and count how many times occurred
        for(int i=0; i<A.length; i++) {
            if(elementsAsAMap.containsKey(A[i])) {
                int occurred = elementsAsAMap.get(A[i]);
                occurred++;
                //add value in the index i to the Map
                elementsAsAMap.put(A[i], occurred);
            }
            //add them to the map with the value 1 so we know that it is occurred only one time
            else {
                elementsAsAMap.put(A[i], 1);
            }

        }

        //use Set to create a Set of unique elements that occurred in array

        Set keySet = elementsAsAMap.keySet();


        System.out.println("Key Elements in set: " + keySet);

        //run loop again and if modulus of the

        for(Object answer : keySet) {
            int occurrences = elementsAsAMap.get(answer);

            //if modulus (rest of division) is diffrent than 0 then return answer
            if(occurrences % 2 != 0) return (int) answer;
        }

        throw new RuntimeException("is something wrong with the code or array?");
    }

    }


