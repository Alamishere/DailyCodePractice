package DailyCodePractice;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class allUnique {
    public static boolean allUniques(List<String> items){
         Set <String> allUniques = new HashSet<>();
        
        return allUniques.size()== items.size();
    }
    
    

  public static void main(String[] args) {
    List<String> test1 = List.of("apple", "banana", "cherry");
    List<String> test2 = List.of("dog", "cat", "dog");

    System.out.println(allUniques(test1)); 
    System.out.println(allUniques(test2)); 
  }
}
