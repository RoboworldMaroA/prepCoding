package codilityTask1;

import java.util.HashSet;

public class MissingInteger {

    public int solution(int[] A){
        HashSet<Integer> nums = new HashSet<Integer>();
        for(int i =1;i<=A.length+1;i++){

            nums.add(i);
        }



        for(int a:A){
            nums.remove(a);
        }
        return nums.iterator().next();


    }

    public static void main(String[] args){

        int[] A = new int[]{1, 3, 6, 4, 1, 2};

        MissingInteger missingInteger = new MissingInteger();
        System.out.println(missingInteger.solution(A));


    }

}
