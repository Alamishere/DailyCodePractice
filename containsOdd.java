package DailyCodePractice;
import java.util.Arrays;
import java.util.List;
public class containsOdd {
    public static boolean onlyOddNumber(List<Integer> list){
        for(int i: list){
            if(i%2 == 0){
                return false;
            }           
        }
        return true;
    }

public static void main(String[] args) {
    List<Integer> oddNumber = Arrays.asList(1,3,5,9); 

    System.out.println(" The values are "+ onlyOddNumber(oddNumber));
}
    
}
