package codilityTask1;

import java.util.HashSet;

public class MissingInteger {

    public int solution(int[] A){
        HashSet<Integer> nums = new HashSet<Integer>();
        for(int i =1;i<=A.length+1;i++){

            nums.add(i);
        }

        for(int a:A){
            nums.remove(new Integer(a));
        }
        return nums.iterator().next();

    }

    public static void main(String[] args){

        int[] A1 = new int[]{1, 3, 6, 4, 1, 2};//test 1
        int[] A2 = new int[]{1, 2, 3};//test 2
        int[] A3 = new int[]{-2,-1};//test 3

        MissingInteger missingInteger = new MissingInteger();
        System.out.println("Test one : Missing value is: "+ missingInteger.solution(A1));
        System.out.println("Test two : Missing value is: "+ missingInteger.solution(A2));
        System.out.println("Test three : Missing value is: "+ missingInteger.solution(A3));
    }

}
