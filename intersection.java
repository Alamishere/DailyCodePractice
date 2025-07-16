package DailyCodePractice;

import java.util.ArrayList;
import java.util.HashSet;

/*Write a method, intersection, that takes in two Lists, a,b, as arguments. The method should return a new List containing elements that are in both of the two Lists.
You may assume that each input List does not contain duplicate elements. 
List<Integer> a = List.of(4,2,1,6);
List<Integer> b = List.of(3,6,9,2,10);
Source.intersection(a, b) // -> [2,6]*/

import java.util.List;

public class intersection {
    public static List<Integer> intersections(List<Integer> listA, List<Integer> listB) {
        HashSet <Integer> setA = new HashSet<>(listA);
        List<Integer> result = new ArrayList<>();

        for(int ele: listB){
            if(setA.contains(ele)){
                result.add(ele);
            }
        }
    return result;
}
    public static void main() {
        List<Integer> a = List.of(4,2,1,6);
        List<Integer> b = List.of(3,6,9,2,10);
        System.out.println(intersections(a, b));

    }
}
