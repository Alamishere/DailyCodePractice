package DailyCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Write a method, pairSum, that takes in a List and a target sum as arguments. 
The function should return a List containing a pair of indices whose elements sum to the given target. The indices returned must be unique.
Be sure to return the indices, not the elements themselves.
There is guaranteed to be one such pair that sums to the target. */
public class pairSum {
    public static List<Integer> pairs(List<Integer> numbers, int target){
        for(int i=0;i<numbers.size();i++){
            for(int j=i+1;j<numbers.size();j++){
                if(numbers.get(i) + numbers.get(j) == target){
                    return List.of(i, j); 
                }
            }
        }
        return null;
    }


 public static void main(String[] args) {
        // Test case 1: Basic case
        List<Integer> numbers = Arrays.asList(2, 7, 11, 15);
        int target = 9;
        List<Integer> result1 = pairs(numbers, target);
        System.out.println("Test 1 - Input: " + numbers + ", Target: " + target);
        System.out.println("Result: " + result1);
        System.out.println("Elements at indices: " + numbers.get(result1.get(0)) + " + " + numbers.get(result1.get(1)) + " = " + (numbers.get(result1.get(0)) + numbers.get(result1.get(1))));
        System.out.println();
    }
    
}
