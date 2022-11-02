package longest.common.prefix;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.

 */


import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {


    public static String longestCommonPrefix(String[] strs) {
        String answer = "bhbh";
        //String answer = strs[1];

        return answer;
    }



    public static int convertToInteger(String input){

        //maping allws to set a value to the character
        Map<Character,Integer> map =new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result =0;
        for(int i=0;i<input.length();i++){

            if(i>0 && map.get(input.charAt(i))>map.get(input.charAt(i-1))){
                //result+=map.get(input.charAt(i))-2*map.get(input.charAt(i-1));
                result=result+map.get(input.charAt(i))-2*map.get(input.charAt(i-1));
            }

            else{

                result+=map.get(input.charAt(i));
            }

                    }


        return result;

    }



    //main method

    public static void main(String args[]){
        //String[] word=new String[]{"I","V","X","L","C","D","M"};

        //it is working for correct value but if you do that differently then is calculated wrong need to modify
        String[] strs= new String[]{"flower","flow","flight"};

        //print a reversed word in the function reverseWord
        System.out.println("This is a longest common string: " + longestCommonPrefix(strs));



        }

}
