package DailyCodePractice;
import java.util.Arrays;
/*Write a method, anagrams, that takes in two strings as arguments. The method should return a boolean indicating whether or not the strings are anagrams.
 Anagrams are strings that contain the same characters, but in any order. 
 Source.anagrams("restful", "fluster"); // -> true*/

public class anagrams{
    public static boolean anagram(String s1, String s2) {

      if(s1.length()!=s2.length()){
        return false;
      }
      char[]a1= s1.toCharArray();
      char[]a2= s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

      return Arrays.equals(a1,a2);
  }

  public static void main(String[] args) {
    System.out.println(anagram("restful", "fluster"));   // true
    System.out.println(anagram("hello", "billion"));     // false
    System.out.println(anagram("Listen", "Silent"));     // true (when ignoring case)
}


}