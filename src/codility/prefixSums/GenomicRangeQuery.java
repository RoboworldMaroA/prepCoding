package codility.prefixSums;

/*
09.03.2023
Codility - level medium

A DNA sequence can be represented as a string consisting of the letters A, C, G and T, which correspond to the types of successive nucleotides in the sequence. Each nucleotide has an impact factor, which is an integer. Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively. You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?

The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters. There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers. The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive).

For example, consider string S = CAGCCTA and arrays P, Q such that:

    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6
The answers to these M = 3 queries are as follows:

The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2 respectively, so the answer is 2.
The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide A whose impact factor is 1, so the answer is 1.
Write a function:

class Solution { public int[] solution(String S, int[] P, int[] Q); }

that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M integers specifying the consecutive answers to all queries.

Result array should be returned as an array of integers.

For example, given the string S = CAGCCTA and arrays P, Q such that:

    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6
the function should return the values [2, 4, 1], as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
M is an integer within the range [1..50,000];
each element of arrays P and Q is an integer within the range [0..N - 1];
P[K] ≤ Q[K], where 0 ≤ K < M;
string S consists only of upper-case English letters A, C, G, T.




 */

//100% Big O(N+M) notation

public class GenomicRangeQuery {

    public static void main(String[] args) {

          /*
        NUCLEOTIDE IMPACT FACTOR
        A = 1
        C = 2
        G = 3
        T = 4
         */
        String S="CAGCCTA";
        //IT MEANS THAT BETWEEN S[2] (INDEX 2 MEANS THIRD LETTER "G") AND S[4] (C) ARE  "G,C,C" SO IMPACT FACTORS ARE 3 (G) AND 2 (C) SO THE SMALLEST IS 2
        //IT MEANS THAT BETWEEN S[5] AND S[5] ARE  "T" SO IMPACT FACTORS IS 4 THE SMALLEST IS 4
        //IT MEANS THAT BETWEEN S[0] AND S[6] ARE  "C,A,G,C,C,T,A" SO IMPACT FACTORS ARE 2 (C), 3 (G), 1 (C), 4 (T) AND 1 (A) THE SMALLEST IS 1
        int[] P=new int[]{2,5,0};
        int[] Q=new int[]{4,5,6};

        // object of the solution where StarterClass is a name of the java class so when you copy
        // and paste then change this for a class name of the ne task
        GenomicRangeQuery answerSolution = new GenomicRangeQuery();
//        System.out.println("Answer : " + answerSolution.solution(S,P,Q));

        int[] result = answerSolution.solution(S,P,Q);
        for (int i: result
             ) {
            System.out.print(i+ ", ");

        }


    }

    public int[] solution(String S, int[] P, int[] Q) {


    //Create 2 dimention Array that will keep A,C,G and T will be ignored because if in the
        // given S string with these letters there is no A,C or G it means that there must be T and answer is 4
        //In case that we can find first A then we wont be checking rest of the array because we know that the smallest is A=1

        int[][] counters = new int[3][S.length()+1];


        int a = 0;
        int c = 0;
        int g = 0;

       // loop thre all elements in string and calculate A, C and G
        for(int i=0;i<S.length() ;i++) {
            String ch = S.substring(i,i+1);
            if(ch.equals("A")) {
                a++;
            }
            else if(ch.equals("C")){
                c++;}
            else if(ch.equals("G")) {
                g++;
            }

            counters[0][i+1]=a;
            counters[1][i+1]=c;
            counters[2][i+1]=g;
        }
        int[] result = new int[P.length];
        for(int i=0;i<result.length;i++) {

            int startIndex = P[i];
            int endIndex = Q[i]+1;

            int res = 4; //initialize to for because 4 is in case that we did not found A,C,G it means we have found T(value of T is 4)

            for(int j=0;j<3;j++){
                if(counters[j][startIndex]!=counters[j][endIndex]){
                    res = j+1;
                    break;
                }
            }
            result[i] = res;


        }
        return result;


    }



}
