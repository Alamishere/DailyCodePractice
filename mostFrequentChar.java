package DailyCodePractice;
/*Write a function, mostFrequentChar, that takes in a string as an argument. The function should return the most frequent character of the string. If there are ties, return the character that appears earlier in the string.
You can assume that the input string is non-empty. 
Source.mostFrequentChar("bookeeper"); // -> 'e'
Source.mostFrequentChar("mississippi"); // -> 'i'
*/

import java.util.HashMap;

public class mostFrequentChar {
    private static HashMap<Character,Integer> charCount(String s){
        HashMap<Character,Integer> count= new HashMap<>();
        for(char c: s.toCharArray()){
            if(count.get(c)== null){
                count.put(c,0);
            }
            count.put(c, count.get(c)+1);
        }
        return count;
    }


      public static char mostFrequentChars(String s) {
        HashMap<Character,Integer> Count = charCount(s);
        char mostFrequent ='\0';
        for(char ch: s.toCharArray()){
            if(mostFrequent == '\0' || Count.get(ch) > Count.get(mostFrequent)){
                mostFrequent=ch;
            }
        }
        return mostFrequent;
      }

      public static void main(String[] args) {
    System.out.println(mostFrequentChars("hello"));
    System.out.println(mostFrequentChars("abc")); 
    System.out.println(mostFrequentChars("mississippi"));
}
    
}
