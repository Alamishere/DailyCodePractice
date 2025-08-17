package DailyCodePractice;

import java.util.List;
import java.util.ArrayList;

public class fizzbuzz {
    public static List<Object> fizzBuzz(int n) {
        List<Object> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("fizzbuzz");
            } else if (i % 3 == 0) {
                result.add("fizz");
            } else if (i % 5 == 0) {
                result.add("buzz");
            } else {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 19;
        System.out.println(fizzBuzz(number));
    }
}
