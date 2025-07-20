package DailyCodePractice;
public class maximumSubarray {
    public int maxSubarray(int [] nums){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for(int i=0;i<nums.length;i++){
            curr_sum += nums[i];
            max_sum = Math.max(max_sum, curr_sum);
            
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return max_sum;
    }

     public static void main(String[] args) {
        maximumSubarray solution = new maximumSubarray();

        int[] test1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = solution.maxSubarray(test1);
        System.out.println("Max Subarray Sum (Test 1): " + result1); 

        int[] test2 = {1};
        int result2 = solution.maxSubarray(test2);
        System.out.println("Max Subarray Sum (Test 2): " + result2); 

        int[] test3 = {5, 4, -1, 7, 8};
        int result3 = solution.maxSubarray(test3);
        System.out.println("Max Subarray Sum (Test 3): " + result3); 
    }
    
}
