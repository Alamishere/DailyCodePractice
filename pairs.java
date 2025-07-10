package DailyCodePractice;

import java.util.List;
import java.util.ArrayList;

class pairs {
  public static List<List<String>> pair(List<String> elements) {
   List<List<String>> result = new ArrayList<>();
   for(int i=0;i<elements.size();i++){
        for(int j=i+1;j<elements.size();j++){
            List<String> pair= List.of(elements.get(i),elements.get(j));
            result.add(pair);
        }
        

   }
    return result;
}


public static void main(String[] args) {
    List<String> input = List.of("a","b","c","d");
    List<List<String>> output = pair(input);
    for(List<String>pair: output){
        System.err.println(pair);
    }
}

}