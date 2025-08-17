package DailyCodePractice;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int length=0;

        for(int num:nums){
            set.add(num);
        }
        for(int num: set){
            if(!set.contains(num-1)){
                int current = num;
                int len=0;
                while(set.contains(current)){
                    len++;
                    current++;
                }
                length= Math.max(len, length);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        
        int[] test1 = {100, 4, 200, 1, 3, 2};
        int result1 = solution.longestConsecutive(test1);
        System.out.println("Test 1: [100,4,200,1,3,2] -> Expected: 4, Got: " + result1);
        

        int[] test2 = {};
        int result2 = solution.longestConsecutive(test2);
        System.out.println("Test 2: [] -> Expected: 0, Got: " + result2);
        

        int[] test3 = {1, 1, 1, 1};
        int result3 = solution.longestConsecutive(test3);
        System.out.println("Test 3: [1,1,1,1] -> Expected: 1, Got: " + result3);
    }

}
