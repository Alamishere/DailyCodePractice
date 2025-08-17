package DailyCodePractice;

import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class pairProduct {
    public static List<Integer> Solution(List<Integer>numbers, int target){
        HashMap<Double,Integer> previousNumber = new HashMap<>();
        for(int i=0;i<numbers.size();i++){
            int num= numbers.get(i);
            double complement = (double) target/num;
            if(previousNumber.containsKey(complement)){
                return List.of(i,previousNumber.get(complement));
            }
            previousNumber.put((double) num, i);
        }
        return null;
    }

    public static void main(String [] args){
        List<Integer> numList= Arrays.asList(4,5,6,7);
        int target= 35;
        System.out.println(Solution(numList,target));     

    }
    
}
