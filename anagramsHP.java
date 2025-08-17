package DailyCodePractice;
/*Write a method, anagrams, that takes in two strings as arguments. The method should return a boolean indicating whether or not the strings are anagrams.
 Anagrams are strings that contain the same characters, but in any order. 
 Source.anagrams("restful", "fluster"); // -> true*/
import java.util.HashMap;

public class anagramsHP{
    public static HashMap<Character,Integer> charCount(String s){
    HashMap<Character,Integer> count = new HashMap<>();
      for(int i=0;i<s.length();i++){
        char c= s.charAt(i);
        if(count.get(c)==null){
          count.put(c, 0);
        }
        count.put(c, count.get(c)+1);
      }

      return count;

    }

    public static boolean anagrams(String s1, String s2) {
    return charCount(s1).equals(charCount(s2));
  }


  public static void main(String[] args) {
    System.out.println(anagrams("restful", "fluster"));   // true
    System.out.println(anagrams("hello", "billion"));     // false
    System.out.println(anagrams("Listen", "Silent"));     // true 
  }
}