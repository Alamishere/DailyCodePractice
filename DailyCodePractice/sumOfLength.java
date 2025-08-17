package DailyCodePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sumOfLength {
    public static int sumOfLengths(List<String> strings) {
    if(strings.size() ==0){
      return 0;
    }
    return strings.get(0).length()+ sumOfLengths(strings.subList(1, strings.size()));
  }

  public static void main(String[] args) {
    List <String>someList = new ArrayList<>();
    Collections.addAll(someList, "Apple", "Banana", "Cherry");
    System.out.println("Size of the list is "+ sumOfLength.sumOfLengths(someList));
  }

}

