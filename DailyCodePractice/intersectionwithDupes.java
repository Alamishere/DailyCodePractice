package DailyCodePractice;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class intersectionwithDupes {
    public static List<String> intersectionWithDupe(List<String> listA, List<String> listB) {
        HashMap<String, Integer> countA = eleCount(listA);
        HashMap<String, Integer> countB = eleCount(listB);
        List<String> result = new ArrayList<>();

        for(String ele: countA.keySet()){
            if(countB.containsKey(ele)){
                int minimumTimes = Math.min(countA.get(ele),countB.get(ele));
                for(int i=0;i< minimumTimes ;i++){
                    result.add(ele);
                }
            }
        }
        return result;
    }

    private static HashMap<String,Integer> eleCount(List<String> elements){
        HashMap<String, Integer> count = new HashMap<>();
        for(String ele:elements){
            if(!count.containsKey(ele)){
                count.put(ele,0);
            }
            count.put(ele, count.get(ele)+1);
        }
        return count;
    }
    
    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "c", "b");
        List<String> list2 = List.of("x", "y", "b", "b");
        
        System.out.println("Test Case 1:");
        System.out.println("List A: " + list1);
        System.out.println("List B: " + list2);
        System.out.println("Intersection: " + intersectionWithDupe(list1, list2));
        System.out.println();
        

        List<String> list3 = List.of("a", "a", "a", "a", "a", "a");
        List<String> list4 = List.of("a", "a", "a", "a");
        
        System.out.println("Test Case 2:");
        System.out.println("List A: " + list3);
        System.out.println("List B: " + list4);
        System.out.println("Intersection: " + intersectionWithDupe(list3, list4));
    }
}