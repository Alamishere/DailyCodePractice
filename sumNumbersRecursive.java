package DailyCodePractice;

import java.util.List;

public class sumNumbersRecursive {
    public static int snr(List<Integer>numbers){
        if(numbers.size()==0){
            return 0;
        }
        return numbers.get(0)+snr(numbers.subList(1, numbers.size()));
    }
     public static void main(String[] args) {
        List<Integer> testList = List.of(5, 2, 9, 10);
        int result = snr(testList);
        System.out.println("Sum of numbers: " + result); 
    }
}
    
