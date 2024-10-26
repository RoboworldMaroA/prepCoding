package Leetcode.questionOne;

import java.util.HashMap;
import java.util.Map;

//Tested on LeetCode website

class SolutionV2 {
    //this is given on the beginning in question
    public static int[] twoSum(int[] numsV2, int target) {
        //create map
        Map<Integer, Integer> mapV2 = new HashMap<>();
        for (int i = 0; i < numsV2.length; i++) {
            if (mapV2.containsKey(target - numsV2[i])) {
                return new int[]{i, mapV2.get(target - numsV2[i])};
            }
                mapV2.put(numsV2[i], i);
            }
            return new int[0];
        }

    public static void main(String[] args) {
        //input
        int[] numsV2 = new int[] {1,5,3,4,2,4,4,3,2,4,9,9};
       //target
        int target = 4;
       //result array
        int[] result = twoSum(numsV2,target);

        System.out.println("["+result[0]+","+result[1] +"]");
    }
}
