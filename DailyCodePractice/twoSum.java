package DailyCodePractice;
/*Implement a function in Java that, given a non‐empty array of integers and a target sum, 
returns the indices of the two numbers that add up to the target. You can assume there’s exactly one solution, and you can’t use the same element twice.
Signature: int[] twoSum(int[] nums, int target) 
twoSum(new int[]{2, 7, 11, 15}, 9)  // returns [0, 1]*/

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public int[] TwoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement= target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution"); 
    }

    public static void main(String[] args) {
        int[] numbers={2, 7, 11, 15};
        int target= 13;
        twoSum ts = new twoSum();
        int[] result = ts.TwoSum(numbers, target);

        System.out.println("Values are "+ Arrays.toString(result));
    }
}
