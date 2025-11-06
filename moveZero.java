package DailyCodePractice;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class moveZero {
    public static void main(String[] args) {
        List<Integer> numbIntegers=List.of(-1,4,0,-5,2,0,7,10,-2);
        List<Integer> moveAllIntegers= Stream.concat(numbIntegers.stream().filter(number -> number!=0), 
        numbIntegers.stream().filter(number->number==0)).collect(Collectors.toList());

        System.out.println(moveAllIntegers);
    }

}
