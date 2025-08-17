package DailyCodePractice;

import java.util.Arrays;
import java.util.List;

public class SumNumbers {
public static int sumNumbersRecursive(List<Integer> numbers) {
    
    if(numbers.size()==0){
        return 0;
    }

    return numbers.get(0)+ sumNumbersRecursive(numbers.subList(1,numbers.size()));

    }
 public static void main(String[] args) {
        List<Integer> testList = Arrays.asList(1, 2, 3, 4, 5);
        int result = sumNumbersRecursive(testList);
        System.out.println("Sum is: " + result); 

    }
}