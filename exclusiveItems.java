package DailyCodePractice;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

/*Write a method, exclusiveItems, that takes in two lists, a,b, as arguments. The method should return a new list containing elements that are in either list but not both lists.
You may assume that each input list does not contain duplicate elements. 
List<Integer> a = List.of(4,2,1,6);
List<Integer> b = List.of(3,6,9,2,10);
exclusiveItems(a, b); // -> [4,1,3,9,10]*/

class Source {
    public static List<Integer> exclusiveItems(List<Integer> a, List<Integer> b) {
        HashSet<Integer> setA = new HashSet<>(a);
        HashSet<Integer> setB = new HashSet<>(b);

        HashSet<Integer> onlyA = new HashSet<>(setA);
        onlyA.removeAll(setB); 

        HashSet<Integer> onlyB = new HashSet<>(setB);
        onlyB.removeAll(setA); 

        onlyA.addAll(onlyB); 
        return new ArrayList<>(onlyA);
    }


    public static void main(String[] args) {
        List<Integer> listA = List.of(4, 2, 1, 6);
        List<Integer> listB = List.of(3, 6, 9, 2, 10);

        List<Integer> result = Source.exclusiveItems(listA, listB);

        System.out.println("Exclusive items (only in A or B): " + result);
    }
}


