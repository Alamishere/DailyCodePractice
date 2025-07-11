package DailyCodePractice;
/*Implement a function in Java that, given a non‐empty array of integers and a target sum, 
returns the indices of the two numbers that add up to the target. You can assume there’s exactly one solution, and you can’t use the same element twice.
Signature: int[] twoSum(int[] nums, int target) 
twoSum(new int[]{2, 7, 11, 15}, 9)  // returns [0, 1]*/

public class twoSumBF {
    public int[] Solution(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]== target){
                    return new int[]{i,j};
                }

            }
        }
    throw new IllegalArgumentException("No two-sum solution");
    }
}
