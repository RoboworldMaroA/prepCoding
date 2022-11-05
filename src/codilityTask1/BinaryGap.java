package codilityTask1;
/*
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001
 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1.
 The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
 Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].
 */


import java.util.ArrayList;
import java.util.List;

public class BinaryGap{

    public static void main(String[] args) {

        int numericValue = 9;

        BinaryGap solutionAnswer = new BinaryGap();
        System.out.println("Answer that i got from function solution is :"+solutionAnswer.solution(numericValue));
    }

    public int solution(int N){

       int answer =0;
       String binaryValue = Integer.toBinaryString(N);
        List listOfTheZeros = new ArrayList();
        System.out.println("Binary value : "+binaryValue);
        for(int i=0; i<binaryValue.length();i++) {
//            System.out.println("value of the binary character :" + binaryValue.charAt(i));
                if (binaryValue.charAt(i) == '0')
//                    System.out.println("I am in loop where is 0");
                    continue;
//                    System.out.println("I am in loop where j=0 "+answer);
                //add the indexes where a value was one
            listOfTheZeros.add(i);
            }
//        System.out.println(listOfTheZeros);

        for(int i=0; i<listOfTheZeros.size()-1;i++) {
//            System.out.println("loop a list" + listOfTheZeros);
//            subtract 1 so that don't count 1's next to each other as having any gap
            int indicesDifferent = (int) listOfTheZeros.get(i+1)-(int) listOfTheZeros.get(i)-1;
            answer = Math.max(answer, indicesDifferent);
        }
//        System.out.println("List of the idexes whe was zero zeros :" + listOfTheZeros.toString());
        return answer;
    }
}


