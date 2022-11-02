package Leetcode.questionOne;

import java.util.HashMap;
import java.util.Map;

//not sure is ok i have from you tube video

class Solution {
    //this is given on the beginning in question
    public static int[] twoSum(int[] nums, int target) {
        //create map
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
                map.put(nums[i], i);
            }
            return new int[0];
        }

    public static void main(String[] args) {
        //input
        int[] nums = new int[] {1,5,3,4,2,4,4,3,2,4,9,9};
       //target
        int target = 10;
       //result array
        int[] result = twoSum(nums,target);

        System.out.println("["+result[0]+","+result[1] +"]");
    }
}
