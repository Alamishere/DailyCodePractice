package DailyCodePractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HasSubarraySum {
    public static boolean hasSubarraySum(List<Integer> numbers, int targetSum) {
    List<Integer> prefixSums = new ArrayList<>();
    prefixSums.add(0);
    int total = 0;
    for (int num : numbers) {
      total += num;
      prefixSums.add(total);
    }

    Set<Integer> seen= new HashSet<>();
    for(int current:prefixSums){
      int complement = current - targetSum;
      if(seen.contains(complement)){
        return true;
      }
      seen.add(current);
    }
    
    return false;
    }
     public static void main(String[] args) {
        System.out.println(hasSubarraySum(List.of(1, 3, 1, 4, 3), 8)); 
        
        System.out.println(hasSubarraySum(List.of(1, 3, 1, 4, 3), 8)); 
        
        System.out.println(hasSubarraySum(List.of(1, 2, 3), 10));     

        System.out.println(hasSubarraySum(List.of(5, 2, 3), 5));  

        System.out.println(hasSubarraySum(List.of(1, 2, 3, 4), 10));
        
        System.out.println(hasSubarraySum(List.of(4, 2, 5, 1, 5, -2, 8), 9)); 
        
        System.out.println(hasSubarraySum(List.of(2, 1, 3, 5), 9)); 
    }
}
