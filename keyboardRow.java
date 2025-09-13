package DailyCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class keyboardRow {
    public String [] findWords(String[] words){
        HashMap<Character,Integer> map = new HashMap<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

         List<String> result = new ArrayList<>();

        for(char c:row1.toCharArray()) {
            map.put(c,1);
        }

        for(char c:row2.toCharArray()) {
            map.put(c,2);
        }

        for(char c:row3.toCharArray()) {
            map.put(c,3);
        }

        for(String word : words){
            String lower = word.toLowerCase();
            int row = map.get(lower.charAt(0));
            boolean valid=true;

            for(char c: lower.toCharArray()){
                if(map.get(c)!= row){
                    valid=false;
                    break;
                }
            }

            if(valid) result.add(word);
        }

        return result.toArray(new String[0]);
    }

     public static void main(String[] args) {
        keyboardRow sol = new keyboardRow();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(sol.findWords(words))); 
    }
    
    
}
